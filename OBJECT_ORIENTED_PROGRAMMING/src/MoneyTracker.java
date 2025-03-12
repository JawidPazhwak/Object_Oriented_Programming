public class MoneyTracker{
    public String name;
    public double currentBalance;
    public double lastAdded;
    public int expense;
    

    public String info(){
        return "Name: " + name + "\n" + "Current Balance: " + currentBalance; 

    }
    public void createTracker(String name){
        this.name = name;
    }
    public void income(double income){
        currentBalance += income;
        lastAdded = income;
        System.out.println("Balance updated!");
    }
    public void expense(int expense){
        this.expense = expense;
        if(currentBalance > expense){
            currentBalance = currentBalance - this.expense;
            System.out.println("Current balance updated");
        }
        else{
            System.out.println("You are broke!");
        }
        
    }
    public void showHistory(){
        System.out.println("Last Added: " + lastAdded);
        System.out.println("Last Spent: " + this.expense);
    }

}
