package assignments.week1;
// Import scanner utility//
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "ooooo                 .                                             .                      \r\n" + //
                        "`888'               .o8                                           .o8                      \r\n"
                        + //
                        " 888  ooo. .oo.   .o888oo  .ooooo.  oooo d8b  .ooooo.   .oooo.o .o888oo                    \r\n"
                        + //
                        " 888  `888P\"Y88b    888   d88' `88b `888\"\"8P d88' `88b d88(  \"8   888                      \r\n"
                        + //
                        " 888   888   888    888   888ooo888  888     888ooo888 `\"Y88b.    888                      \r\n"
                        + //
                        " 888   888   888    888 . 888    .o  888     888    .o o.  )88b   888 .                    \r\n"
                        + //
                        "o888o o888o o888o   oooo\" `Y8bod8P' d888b    `Y8ooooP' 8\"\"888P'   \"8.8\"                    \r\n"
                        + //
                        "                    `888                        `888              .o8                      \r\n"
                        + //
                        " .ooooo.   .oooo.    888   .ooooo.  oooo  oooo   888   .oooo.   .o888oo  .ooooo.  oooo d8b \r\n"
                        + //
                        "d88' `\"Y8 `P  )88b   888  d88' `\"Y8 `888  `888   888  `P  )88b    888   d88' `88b `888\"\"8P \r\n"
                        + //
                        "888        .oP\"888   888  888        888   888   888   .oP\"888    888   888   888  888     \r\n"
                        + //
                        "888   .o8 d8(  888   888  888   .o8  888   888   888  d8(  888    888 . 888   888  888     \r\n"
                        + //
                        "`Y8bod8P' `Y888\"\"8o o888o `Y8bod8P'  `V88V\"V8P' o888o `Y888\"\"8o   \"888\" `Y8bod8P' d888b");
        System.out.println();
        // prompt user for principal amount//
        System.out.print("Please enter the principal of your loan? $");
        double p1 = input.nextDouble();
        // prompt user for interest rate//
        System.out.println("Next, what is the interest rate %");
        // convert interest rate into decimal//
        double r1 = input.nextDouble() / 100;
        // prompt user for loan terms//
        System.out.println("How long is the loan terms in years?");
        int t1 = input.nextInt();
        // create variable for interest rate and calculation //
        // A =P(1 + rt)
        double interest = p1 * (1 + r1 * t1);

        System.out.printf("The interest on your loan is $%.2f", interest);

        input.close();

    }
}
