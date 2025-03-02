public class BookTester {
    public static void main(String[] args) {
        Book person = new Book();
        person.show();
        System.out.println("===================");
        person.add("Harry Potter", "J", 123456789);
        person.show();
        System.out.println("===================");
        person.borrow("Harry Potter", "J", 123456789);
        person.show();
        System.out.println("===================");
        person.Return("Harry Potter", "J", 123456789);
        person.show();
    }
}
