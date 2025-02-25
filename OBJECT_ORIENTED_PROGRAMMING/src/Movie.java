public class Movie {
    public String title;
    public String genre;
    public float rating;

    public void show(){
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    public void update(String t, String g, float r){
        title = t;
        genre = g;
        rating = r;
    }
    public void delete(String t, String g, float r){
        title = null;
        genre = null;
        rating = 0;
    }

}
