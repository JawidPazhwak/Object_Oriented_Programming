public class SocialMediaUser {
    public String userName;
    private String email;
    private String passwrod;

    public SocialMediaUser(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.passwrod = password;
        System.out.println("User created");
    }
    public String detail(){
        return ("Name: " + userName + "\n" + "Email: " + email + "\n" + "Password: " + passwrod);
    }
    public void set(String email, String password){
        this.email = email;
        this.passwrod = password;
    }
    public String get(String email, String password){
        return email;
    }
}
