public class SpotifyTester {
    public static void main(String[] args) {
        Song s1 = new Song("Chill beats", "A", 1);
        Playlist p1 = new Playlist("1");
        Spotify s = new Spotify();
        System.out.println("==============");
        p1.addSong(s1);  
        s.creatPlaylist(p1);
        s.display(p1);
    }
     
}
