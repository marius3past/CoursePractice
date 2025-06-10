package problema1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(2435,"idbn15343428");
        BankAccount account2 = new BankAccount(3200,"idbn15343572");
        account1.deposit(148.78);
        account1.showBalance();
        account2.withdraw(303);
        account2.showBalance();
    }
}