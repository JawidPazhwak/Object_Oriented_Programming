public class ShoppingTester {
    public static void main(String[] args) {
        ShoppingItem item1 = new ShoppingItem("Apple", 10, "Fruits");
        ShoppingItem item2 = new ShoppingItem("Carrot",  5, "Vegetables");
        System.out.println(item1.itemDetails());
        System.out.println(item2.itemDetails());
        System.out.println("===============");
        
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.cartDetails();
    }
}
