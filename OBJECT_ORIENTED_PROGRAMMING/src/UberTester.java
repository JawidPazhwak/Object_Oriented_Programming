public class UberTester {
    public static void main(String[] args) {
        Uber u = new Uber("Audi", "123A");
        Passenger p1 = new Passenger("A", 123);
        Passenger p2 = new Passenger("B", 456);
        Passenger p3 = new Passenger("c", 789);

        u.addPassenger(p1);
        u.addPassenger(p2);
        u.addPassenger(p3);

        p1.details();
        p2.details();
        p3.details();

        Uber.listPassenger();
    }
}
