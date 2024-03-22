package assignments.week1;
// import Scanner utility//
import java.util.Scanner;

public class CompoundInterest {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
// prompt for principal//
        System.out.print("Please enter the principal of your loan? $");
    double p1 = input.nextDouble();
    // prompt for interest rate
    System.out.println("Next, what is the interest rate %");
        double r1 = input.nextDouble() /100;
// prompt for loan terms//
        System.out.println("how long the loan terms in years?");
        double t1 = input.nextDouble();
// declare interger for annual accrual//
        int n1 = 12;
// formula for calculating compound interest//
// A = P(1 + r/n)nt//
        double interest = p1 * Math.pow((1 + r1 / n1), n1 * t1);
        double compound = interest - p1;

        System.out.format("The compound interest on your loan is $%,.2f%n", compound);

        input.close();

}
}
