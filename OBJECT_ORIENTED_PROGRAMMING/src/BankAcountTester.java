public class BankAcountTester {
    public static void main(String[] args) {
        BankAccount person = new BankAccount();
        person.display();
        person.Account("A", 123456789, 1000);
        person.deposit(1000);
        person.withdraw(20);
        person.display();
    }
}
