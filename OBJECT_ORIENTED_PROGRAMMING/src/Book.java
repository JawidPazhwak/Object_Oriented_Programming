public class Book {
    public String title;
    public String author;
    public boolean isavaiable;
    public int isbn;

    public void add(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        System.out.println("Title: " + title + " Author: " + author + " ISBN: " + isbn + " added");    
    }
    public boolean isAvaiable(String title, String author){
        if(title.equals(this.title) && author.equals(this.author)){
            return  true;
        }
        else{
            return  false;
        }
    }
    public void borrow(String title, String author, int isbn){
        if(isAvaiable(title, author)){
            System.out.println("You can borrow the book " + title + " by " + author);
            this.title = "Empty";
            this.author = "Empty";
            this.isbn = 0;
        }
        else{
            System.out.println("You can not borrow as the book " + title + " by " + author + " is not available");
        }
    }
    public void Return(String title, String author, int isbn){
        if(!isAvaiable(title, author)){
            add(title, author, isbn);
            System.out.println(title + " by " + author + " Successfully returned");
        }
        else{
            System.out.println("You can not return the book as you have not borrowed any book");
        }

    }
    public void show(){
        System.out.println("Books: " + "\033");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
