public class Database {
    public String name;
    public String profession;
    public String country;

    public void update(String n, String p, String c){
        name = n;
        profession = p;
        country = c;
    }
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Country: " + country);

    }

}
