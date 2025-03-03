public class OrganizerTester {
    public static void main(String[] args) {
        Organizer obj1 = new Organizer("Plastic", 1, false);
        Organizer obj2 = new Organizer(false);
        obj1.show();
        System.out.println("==============");
        obj2.show();
    }
}
