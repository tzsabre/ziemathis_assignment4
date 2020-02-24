package ziemathis_problem2;

public class SavingsAccountTest {

    public static void main(String[] args) {


        SavingsAccount saver1, saver2;

        saver1 = new SavingsAccount(2000);
        saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);


        System.out.printf("Month");
        System.out.printf("\tSaver1");
        System.out.println("\t\tSaver2");

        for (int i = 1; i <= 12; i++) {

            saver1.calculateMonthlyInterest();

            saver2.calculateMonthlyInterest();

            System.out.print(i);
            System.out.printf("\t$%.2f",saver1.getSavingsBalance());
            System.out.printf("\t $%.2f\n", saver2.getSavingsBalance());

        }

        SavingsAccount.modifyInterestRate(5);


        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();


        System.out.println("\nNext Months Balances \n");
        System.out.printf("Saver 1:$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2:$%.2f\n", saver2.getSavingsBalance());

    }

}