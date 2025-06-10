package firstproblem;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    public final void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}