

public class Parcel {
    public int weight;
    public int fee;
    public String name;

    public Parcel(){
        System.out.println("Set name first");
    }
    public Parcel(String name){
        this.name = name;
    }
    public Parcel(String name, int weight ){
        this.name = name;
        this.weight = weight;
    }
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Total weight: " + weight);
        System.out.println("Total fee: " + fee);
    }
    public void calcFee(String location){
        if(location.equals("Asia")){
            fee = fee + (20 * weight + 50);
        }
        else{
            fee = fee + (20 * weight);
        }
    }
    public void addWeight(int weight){
        this.weight = this.weight + weight;
    }
}
