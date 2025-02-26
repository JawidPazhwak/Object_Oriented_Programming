public class DatabaseTester {
    public static void main(String[] args) {
        Database obj1 = new Database();
        Database obj2 = new Database();
        Database obj3 = new Database();

        obj1.show();
        obj2.show();
        obj3.show();

        String n = "A";
        String p = "B";
        String c = "C";

        obj1.update(n, p, c);
        obj2.update(n, p, c);
        obj3.update(n, p, c);

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
