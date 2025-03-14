public class Library {
    public String book;
    public String genre;
    public String year;
    public String author;
    public int pages;

    public void createBook(String book){
        this.book = book;
    }
    public void createBook(String year, String book){
        this.book = book;
        this.year = year;       
    }
    public void createBook(String book1, String author, String genre){
        this.book = book1;
        this.author = author;
        this.genre = genre;
    }
    public void customizeGenre(String genre){
        this.genre = genre;
        System.out.println("Updated genre of " + book + " to " + genre);
    }
    public void customizePages(int pages){
        this.pages = pages;
        System.out.println("Updated pages of " + book + " to " + pages);
    }
    public void displayDetails(){
        System.out.println("Title: " + book + ", " + "Author: " + author + ", " + "Genre: " + genre + ", " + "Pages: " + pages);
    }

}
