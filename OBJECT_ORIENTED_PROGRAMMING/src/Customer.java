public class Customer {
    public String name;
    public String [] cart = new String[4];
    public int [] price = new int[4];
    public int index;
    public int totalPrice;
    public int index1;

    public void createCustomer(String name){
        this.name = name;
    }
    public void showCart(){
        System.out.println("Customer: " +name);
        for(int i = 0; i < cart.length && i < price.length; i ++){
            if(cart[i] != null){
                System.out.println("Item: " + cart[i] + ": " + price[i]);
            }
        } 
    }
    public void addItem(String item, int amount){
        if(index < cart.length){
            cart[index] = item;
            System.out.println(cart[index] + " added to cart");
            index ++;
        }
        else{
            System.out.println("Cart is full");
        }
        if(index1 < price.length){
            price[index1] = amount;
            index1 ++;
        }

    }
    public void addItem(String item1, int amount1, String item2, int amount2){
        if(index < cart.length){
            cart[index] = item1;
            index ++;
        }
        if(index < cart.length){
            cart[index] = item2;
            System.out.println(cart[index - 1] + " and " + cart[index] + " added to cart");
            index ++;
        }
        if(index1 < price.length){
            price[index1] = amount1;
            index1 ++;
        }
        
        if(index1 < price.length){
            price[index1] = amount2;
            index1 ++;
        }
    }
    public void calculatePrice(){
        for(int i = 0; i < price.length; i++){
            totalPrice = totalPrice + price[i];
        }
        System.out.println("Total: " + totalPrice);
    }
}
