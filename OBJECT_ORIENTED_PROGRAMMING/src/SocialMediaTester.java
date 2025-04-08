public class SocialMediaTester {
    public static void main(String[] args) {
        SocialMedia m1 = new SocialMedia();
        SocialMediaUser user1 = new SocialMediaUser("A", "A@gmail.com", "123");
        SocialMediaUser user2 = new SocialMediaUser("B", "B@gmail.com", "123");
        SocialMediaUser user3 = new SocialMediaUser("C", "C@gmail.com", "123");
        m1.addUser(user1);
        m1.details(user1);
        m1.removeUser(user1);
        m1.details(user1);
        m1.removeUser(user2);
        m1.addUser(user3);
        m1.details(user3);
        m1.removeUser(user3);
    }
}
