import java.util.Scanner;
public class MovieTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String t = sc.nextLine();
        System.out.println("Enter the genre: ");
        String g = sc.nextLine();
        System.out.println("Enter the rating: ");
        float r = sc.nextFloat(); 

        Movie m = new Movie();
        System.out.println("Before: ");
        m.show();
        System.out.println("After: ");
        m.update(t, g, r);
        m.show();
        m.delete(t, g, r);
        System.out.println("After deletion: ");
        m.show();
    }
}
