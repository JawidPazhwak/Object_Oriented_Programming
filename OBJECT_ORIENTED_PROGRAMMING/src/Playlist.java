

public class Playlist {
    public Song[] songs = new Song[5];
    public int index;
    public String name;
    
    public Playlist(String name){
        this.name = name;
        System.out.println("Playlist is created");
    }
    
    public void addSong(Song s){
        if(index < songs.length){
            if(songs[index] == null){
                songs[index++] = s;
            }
            else{
                System.out.println("Playlist full");
            }
        }
    }
    public void removeSong(Song s){
        for(int i = 0; i < songs.length; i ++){
            if(songs[i] != null){
                if(songs[i] == s){
                    songs[i] = null;
                    return;
                }
                else{
                    System.out.println("Could not find the song");
                    return;
                }
            }
        }
    }
    public void display(){
        for(int i = 0; i < songs.length; i ++){
            if(songs[i] != null){
               songs[i].details();
               return;
            }
        }
        System.out.println("Playlist is empty");
    }
}
