public class Uber extends Person{
    public String carModel;
    public String licencePlate;
    public static Passenger[] passenger = new Passenger[4];

    public Uber(String carModel, String licencePlate){
        this.carModel = carModel;
        this.licencePlate = licencePlate;
        System.out.println(carModel + " " + licencePlate + " created");
    }
    public void addPassenger(Passenger p){
        for(int i = 0; i < passenger.length; i ++){
            if(passenger[i] == null){
                passenger[i] = p;
                System.out.println(p.name + " added");
                return;
            }
        }
        System.out.println("No space");
    }
    public void removePassenger(Passenger p){
        for(int i = 0; i < passenger.length; i ++){
            if(passenger[i].equals(p)){
                passenger[i] = null;
                System.out.println(p.name + " removed");
                return;
            }
        }
        System.out.println("Could not find " + p.name);
    }
    public static void listPassenger(){
        for(int i = 0; i < passenger.length; i ++){
            if(passenger[i] != null){
                System.out.println(passenger[i].id + ": " + "Name: " + passenger[i].name);
            }
            else{
                System.out.println("Empty");
                break;
            }
        }
    }
}
