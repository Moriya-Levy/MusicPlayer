package MusicPlayerServer.MusicPlayerServer.components;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SongService {
    void addSong(Song s);
    List <Song> getAllSongs();
    Optional<Song> getSongById(int id) ;
    void deleteSongById(int id);
    Song updateSong(int id, Song s);
    List <Song> getSongsByArtist(String a);
}
