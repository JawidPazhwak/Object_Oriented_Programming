public class Email {
    public String name;
    private String password;
    public String p;
    
    public String getPassword(){
        return "Password: " + password;
   }
    public void setPassword(String password){
        this.password = password;
        p = this.password;
   }
}
