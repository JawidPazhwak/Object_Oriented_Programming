public class ShoppingCart {
    public ShoppingItem [] itemList = new ShoppingItem[5];
    public int index;

    public void addItem(ShoppingItem i){
        if(index < itemList.length){
            itemList[index] = i;
            index ++; 
        }
        else{
            System.out.println("Capacity exceeds. Maximum capacity: " + 5);
        }
    }
    public void cartDetails(){
        for(int i = 0; i < itemList.length; i ++){
            if (itemList[i] != null) {
                System.out.println("Item " + (i + 1) + ": " + itemList[i].itemDetails());    
            }
            else{
                System.out.println("Item " + (i + 1) + ": Empty");
            }
            
        }
    }
}

