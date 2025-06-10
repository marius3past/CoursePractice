package problema1;

public class BankAccount {
    private  double balance;
    private  String accountId;

    BankAccount(double balance, String accountId) {
        this.balance = balance;
        this.accountId = accountId;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(" The account with the ID " + accountId + " deposited " + amount + " $ ");
        } else {
            System.out.println(" Amount must be positive ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0  && amount<= balance) {
            this.balance -= amount;
            System.out.println(" The account with the ID " + accountId + " withdrew " + amount + " $ ");
        }

        else {
            System.out.println("The withdrawal is not possible ");
        }
    }

    public void showBalance() {
        System.out.println(" The new balance is : " + balance);
    }
}
