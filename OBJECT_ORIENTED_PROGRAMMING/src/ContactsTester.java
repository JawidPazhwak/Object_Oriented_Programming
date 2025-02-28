import java.util.Scanner;
public class ContactsTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacts obj = new Contacts();
        obj.add("Bob", 1);
        obj.add("Alex", 2);
        obj.add("x", 3);
        obj.add("y", 4);
        obj.add("z", 5);

        obj.check("Bob");
        obj.display();
    }
}
