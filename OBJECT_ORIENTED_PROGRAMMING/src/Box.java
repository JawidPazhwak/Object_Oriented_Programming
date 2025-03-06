public class Box {
    public double width;
    public double height;
    public double length;
    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;

    }
    public void volume(){
        double vol = width*height*length;
        System.out.println("Box Volume: " + vol);
    }
    public void Box(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }
}
