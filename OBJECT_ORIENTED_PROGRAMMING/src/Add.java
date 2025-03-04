public class Add {
    public int a;
    public int b;

    public Add(int a, int b){
        this.a = a;
        this.b = b;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public Add(double a, double b){
        this.a = (int)a;
        this.b = (int)b;
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public Add(String a, String b){
        String sum = a + " " + b;
        System.out.println("Sum: " + sum);
    }
}
