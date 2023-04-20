public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0;

    // constructor 
    public BankAccount() {
        numberOfAccounts++;
    }

    // METHODS
    // public void deposit(Double amount, double bankAccount) {
    //     if (bankAccount = this.checkingBalance) {
    //         this.checkingBalance = this.checkingBalance + amount;
    //     }
    //     else {
    //         this.savingsBalance = this.savingsBalance + amount;
    //     }
    //     totalMoneyStored = this.checkingBalance + this.savingsBalance;

    // }

    public void depositChecking(Double amount) {
        this.checkingBalance = this.checkingBalance + amount;
        BankAccount.totalMoneyStored = this.checkingBalance + this.savingsBalance;
    }

    public void depositSavings(Double amount) {
        this.savingsBalance = this.savingsBalance + amount;
        BankAccount.totalMoneyStored = this.checkingBalance + this.savingsBalance;
    }


    public void withdrawl(Double amount) {
        if (BankAccount.totalMoneyStored < amount) {
            System.out.println("Not enough money to do withdrawl");
        } else {
            BankAccount.totalMoneyStored = BankAccount.totalMoneyStored - amount;
            this.checkingBalance = this.checkingBalance - amount;
        }
    }
    

    public void totalMoney() {
        System.out.println("----------------Bank Account----------------------");
        System.out.println("Total Balance " + BankAccount.totalMoneyStored);
        System.out.println("Checking contains " + this.checkingBalance);
        System.out.println("Savings contains " + this.savingsBalance);
        System.out.println("--------------------------------------------------");

    }

    // GETTERS
    public double getCheckingBalance() {
        return this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance = savingsBalance;
    }
}