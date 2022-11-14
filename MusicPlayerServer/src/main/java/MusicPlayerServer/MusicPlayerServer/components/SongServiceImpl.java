package MusicPlayerServer.MusicPlayerServer.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private final SongsRepository repository;
    @Autowired
    public SongServiceImpl(SongsRepository repository) {
        this.repository = repository;
    }
    @Override
    public void addSong(Song s) {
        repository.save(s);
    }

    @Override
    public List <Song> getAllSongs() {
        return repository.findAll();
    }
    @Override
    public Optional<Song> getSongById(int id) {
        return repository.findById(id);

    }
    @Override
    public void deleteSongById(int id){
        repository.deleteById(id);
    }
    @Override
    public Song updateSong(int id, Song s) {
        return repository.findById(id)
                .map(song -> {
                            song.setArtist(s.getArtist());
                            song.setGenre(s.getGenre());
                            song.setPrice(s.getPrice());
                            return repository.save(song);
                        }
                )
                .orElseGet(() -> {
                    s.setId(id);
                    return repository.save(s);
                });
    }

    @Override
    public List<Song> getSongsByArtist(String artist) {
        return repository.findSongsByArtist(artist);
    }
}
