public class BoxTester {
    public static void main(String[] args) {
        Box obj1 = new Box(10, 10, 10);
        Box obj2 = new Box(10, 5, 10);
        System.out.println("First obj: ");
        obj1.Box();
        obj1.volume();
        System.out.println("Second obj: ");
        obj2.Box();
        obj2.volume();
    }
}
