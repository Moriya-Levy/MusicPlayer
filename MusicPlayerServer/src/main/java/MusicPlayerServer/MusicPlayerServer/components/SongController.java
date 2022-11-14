package MusicPlayerServer.MusicPlayerServer.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("songs")
public class SongController {
    @Autowired
    private SongService s;

    @GetMapping("")
    public List <Song> getAllSongs(){
        return  s.getAllSongs();
    }

    @GetMapping("/{id}")
    public Optional<Song> getSpecificCustomer(@PathVariable int id){
        return s.getSongById(id);
    }
    @GetMapping("/byArtistName/{name}")
    public List <Song> getSpecificCustomer(@PathVariable String name){
        return s.getSongsByArtist(name);
    }
    @PutMapping("/{id}")
    public Song updateSong(@RequestBody Song newSong,
                           @PathVariable int id) {
        return s.updateSong(id, newSong);
    }


    @PostMapping("")
    public void add(@RequestBody Song song) {
        s.addSong(song);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        s.deleteSongById(id);
    }

}
