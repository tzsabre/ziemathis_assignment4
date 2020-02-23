package ziemathis_problem2;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;


    public SavingsAccount(double savingsBalance) {

        this.savingsBalance = savingsBalance;

    }

    public double getSavingsBalance() {

        return this.savingsBalance;

    }

     double calculateMonthlyInterest() {
    	
    	double monthlyIntrest;

        monthlyIntrest = (this.savingsBalance * annualInterestRate) / 12;

        this.savingsBalance = this.savingsBalance + monthlyIntrest;

        return monthlyIntrest;

    }

    public static void modifyInterestRate(double intrestRate) {

        annualInterestRate = intrestRate / 100;

    }

}