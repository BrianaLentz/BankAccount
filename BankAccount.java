public class BankAccount{
    // member variables
    private double checkingBalance;
    private double savingsBalance;

    // static variables
    private static int accCount = 0;
    private static double totalMoney = 0;

    // constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accCount++;
    }

    // getters
    public double getCheckingsBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // methods
    public void deposit(double amount, String account) {
        if(account == "checking"){
            this.checkingBalance += amount;
            totalMoney += this.checkingBalance;
        }else{
            this.savingsBalance += amount;
            totalMoney += this.savingsBalance;
        }

    }
    public void withdrawal(double amount, String account) {
        if(account == "checking"){
            double newBalance = this.checkingBalance - amount;
            if(newBalance >= 0){
            this.checkingBalance -= amount;
            }
        }else{
            double newBalance = this.savingsBalance - amount;
            if(newBalance >= 0){
            this.savingsBalance -= amount;
            }
        }
    }

    public double getTotal(){
        return totalMoney;
    }
}