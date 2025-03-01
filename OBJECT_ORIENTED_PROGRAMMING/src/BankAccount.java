

public class BankAccount {
    public String name;
    public int accountnumber;
    public double balance;

    public void display(){
        System.out.println("Name; " + name);
        System.out.println("Account number; " + accountnumber);
        System.out.println("Balance: " + check());
    }
    public void Account(String name, int accountnumber, double balance){
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    public double  check(){
        return balance;
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insuffcient balance");
        }
        else{
            balance = balance - amount;
            System.out.println( "Withdrawed amount: " + amount);
        }      
    }
    public void deposit(int amount){
        System.out.println("Deposited amount: " + balance);
        balance = balance + amount;
    }

}
