public class Car {
    public String color;
    public String model;
    public int wheeldrive;

    public void update(String c, String m, int w){
        color = c;
        model = m;
        wheeldrive = w;

    }
    public void show(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Wheeldrive: " + wheeldrive);
    }
}