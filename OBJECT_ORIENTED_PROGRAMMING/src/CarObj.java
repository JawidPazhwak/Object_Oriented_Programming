public class CarObj {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("Memory address for the obj: " + c1);

        String c = "Red";
        String m = "Audi";
        int w = 4;

        c1.update(c,m,w);
        c1.show();

    }
}
