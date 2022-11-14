package MusicPlayerServer.MusicPlayerServer.components;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SongsRepository extends MongoRepository< Song, Integer> {

    List<Song> findSongsByArtist(String artist);
}
