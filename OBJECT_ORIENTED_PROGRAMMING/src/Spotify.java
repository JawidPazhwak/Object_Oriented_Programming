public class Spotify {
    public Playlist[] playlists = new Playlist[5];
    public int index;

    public void creatPlaylist(Playlist p){
        if(index < playlists.length){
            if(playlists[index] == null){
                playlists[index++] = p;
            }
            else{
                System.out.println("Playlist is full");
            }
        }
    }
    public void display(Playlist p){
        for(int i = 0; i < playlists.length; i ++){
            if(playlists[i] != null){
                if(playlists[i].equals(p)){
                    playlists[i].display();
                    return;
                }
            }           
        }
        System.out.println("Playlist is empty");
    }
}
