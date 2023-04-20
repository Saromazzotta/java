public class TestBankAccount {


    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        b1.depositChecking(5.00);
        b1.depositSavings(10.00);
        b1.totalMoney();

        b1.withdrawl(1.00);
        b1.totalMoney();



    }
}