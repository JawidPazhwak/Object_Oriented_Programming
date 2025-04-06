public class EmailPerson{
    Email e = new Email();
    public EmailPerson(String name, String password){
        e.name = name;
        e.setPassword(password);
    }
    public void login(String name, String password){
        if(e.name.equals(name) && e.p.equals(password)){
            System.out.println("Logged in successfully");     
        }
        else{
            System.out.println("Wrong password or name");
        }
    }
    public void details(){
        System.out.println("Name: " + e.name + "\n" + e.getPassword());
    }    


}