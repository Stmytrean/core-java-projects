public class BankApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Don", 12345, 10000);

        account.displayBalance();

        account.deposit(5000);
        account.displayBalance();

        account.withdraw(3000);
        account.displayBalance();

        account.withdraw(15000);
    }
}
