public class Organizer {
    public String type;
    public int number;
    public boolean isOrganized; 

    public Organizer(String type, int number, boolean isOrganized){
        this.type = type;
        this.number = number;
        this.isOrganized = isOrganized;
    }
    public Organizer(boolean isOrganized){
        if(isOrganized){
            System.out.println("No need to organize");
        }
        else{
            System.out.println("Needs to be organized");
        }
    }
    public void show(){
        System.out.println("Type: " + type);
        System.out.println("Number: " + number);
        System.out.println("IS Organized: " + isOrganized);
    }

}
