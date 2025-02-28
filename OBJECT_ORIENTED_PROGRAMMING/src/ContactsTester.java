public class ContactsTester {
    public static void main(String[] args) {
        Contacts obj = new Contacts();
        obj.add("Bob", 1);
        obj.add("Alex", 2);
        obj.add("x", 3);
        obj.add("y", 4);
        obj.add("z", 5);

        System.out.println(obj.check("Bob"));
        System.out.println(obj.display());
    }
}
