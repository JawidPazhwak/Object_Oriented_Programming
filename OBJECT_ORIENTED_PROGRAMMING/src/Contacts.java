public class Contacts {
    public String [] names = new String[5];
    public int [] numbers = new int[5];
    int index = 0;
    public void add(String n, int num){
        if(index < names.length){
            names[index] = n;
            index++;
        }
        else{
            System.out.println("Memory is full");
        }
    }
    public String display(){
        String contact = "";
        for(int i = 0; i < names.length; i ++){
            contact = contact + names[i] + "/n";
        }
        return contact;
    }
    public boolean check(String n){
        for(int i = 0; i < names.length; i ++){
            if(names[i].equals(n)){
                return true;
            }
        }
        return false;
    }
}
