package MusicPlayerServer.MusicPlayerServer.components;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

enum Genre {ROCK, POP, RAP, CLASSICAL}

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")

public class Song{

    @Id
    private int id;
    private String title;
    private String artist;
    private Genre genre;
    private int length;
    private float price;

}


//public class Song {
//
//    public Song(int id, String title ,String artist, Genre genre,int l ,float price) {
//        this.id = id;
//        this.title = title;
//        this.artist = artist;
//        this.genre = genre;
//        this.price = price;
//    }
//
//    private int id;
//    private String title;
//    private String artist;
//    private Genre genre;
    
//    private int length;
//    private float price;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getArtist() {
//        return artist;
//    }
//
//    public void setArtist(String artist) {
//        this.artist = artist;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//}