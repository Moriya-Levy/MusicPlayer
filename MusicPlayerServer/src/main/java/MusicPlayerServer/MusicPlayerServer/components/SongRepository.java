package MusicPlayerServer.MusicPlayerServer.components;

import java.util.ArrayList;
import java.util.List;

public class SongRepository  {

    private List<Song> songList = new ArrayList<Song>();

    public void addSong(Song s){
        songList.add(s);
        System.out.println("add song");
    }
     public List <Song> getAllSongs(){
         System.out.println("get songs");
         return songList;
     }
     public Song getSongById(int id){
        System.out.println("get song by id");
         for (Song s : songList) {
             if(s.getId()==id)
               return s;
         }
       return null;
    }
     public Song deleteSongById(int id){
         System.out.println("delete song By Id");
         for (Song s : songList) {
             if(s.getId()==id){
               songList.remove(s);
               return s;}
         }
         return null;
     }
     public List <Song> getSongsByArtist(String a){
         System.out.println("get song By artist");
         List <Song> temp = new ArrayList<>();
         for (Song s : songList) {
             if(s.getArtist().equals(a))
              {System.out.println(s.toString());
               temp.add(s);}
         }
         return temp;
     }



    }
