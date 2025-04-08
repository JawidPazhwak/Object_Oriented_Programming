public class SocialMedia{
    public SocialMediaUser[] users = new SocialMediaUser[5];
    public int index;

    public void addUser(SocialMediaUser user){
        if(index < users.length){
            users[index] = user;
            index ++;
            System.out.println("New user added");
        }
    }
    public void removeUser(SocialMediaUser user){
        for(int i = 0; i < users.length; i ++){
            if(users[i] != null){
                if(users[i].equals(user)){
                    users[i] = null;
                    System.out.println(user.userName + " removed");
                    return;
                }
            }
        }
        System.out.println("Could not find the user");
    }
    
    public void details(SocialMediaUser user){
        for(int i = 0; i < users.length; i ++){
            if(users[i] != null){
                if(users[i].equals(user)){
                    System.out.println(user.detail());
                    return;
                }
            }
        }
        System.out.println("Could not find details");
    }
}
