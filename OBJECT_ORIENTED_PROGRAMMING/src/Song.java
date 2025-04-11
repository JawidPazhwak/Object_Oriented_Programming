public class Song {
    public String title;
    public String artist;
    public int duration;

    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public void details(){
        System.out.println("Title: " + title + "\n" + "Artist: " + artist + "\n" + "Duration: " + duration + " h");
    }
}
