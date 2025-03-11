public class ShoppingItem {
    public String name;
    public int price;
    public String catagory;

    public ShoppingItem(String name, int price, String catagory){
        this.name = name;
        this.price = price;
        this.catagory = catagory;
    }
    public String itemDetails(){
        return "Name: " + name + "\n" + "Catagory: " + catagory + "\n" + "Price: " + price;
    }
}
