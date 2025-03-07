public class RectangleTester {
    public static void main(String [] args){
        Rectangle obj1 = new Rectangle(2);
        Rectangle obj2 = new Rectangle(2, 2);
        System.out.println("First Area: " + obj1.length * obj1.width);
        System.out.println("Second Area: " + obj2.length * obj2.width);
    }
}
