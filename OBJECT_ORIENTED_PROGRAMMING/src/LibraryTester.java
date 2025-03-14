public class LibraryTester {
    public static void main(String[] args) {
          
        Library book1 = new Library();
        book1.createBook("The Great Gatsby");
        
        Library book2 = new Library();
        book2.createBook("1984", "George Orwell");
        
        Library book3 = new Library();
        book3.createBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        
        System.out.println("|---Book Customization---|");
        book1.customizeGenre("Classic");
        book1.customizePages(180);
        
        book2.customizeGenre("Dystopian");
        book2.customizePages(328);
        
        book3.customizePages(281);
        
        System.out.println();
        
        System.out.println("|---Library Inventory---|");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

    
      
    }
}
