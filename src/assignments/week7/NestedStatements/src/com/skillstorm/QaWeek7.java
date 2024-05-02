package assignments.week7.NestedStatements.src.com.skillstorm;

public class QaWeek7 {
    public static void main(String[] args) {

        // simple if - else example
        int x = 10;

        if (x > 5) { // condition true / false
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }

        // Test 1 question 6
        // results in printing 3 but why?

        boolean flag = true; // initializes a boolean variable 'flag' and sets it to true
        // conditional statements
        if (flag = false) { // changes the initial value of 'flag' to false
            System.out.println("1");
        } else if (flag) { // since first if evaluated to false falls through to else if
            System.out.println("2");
        } else if (!flag) { // since this evaulates to true, the print statement gets run
            System.out.println("3");
        } else
            System.out.println("4"); // never evaluates since condition was met


        // nested if - else example    
        boolean flag1 = true; // false;
        if (flag1) // falls through >>>>>>>>>>>> if false jumps to else @ line 39 and ends.
            if (flag1)// falls through
                if (flag1)// falls through
                    System.out.println("False True"); // prints when run with true
                else
                    System.out.println("True False");
            else
                System.out.println("True True");
        else
            System.out.println("False False");

    }
    // if w/ no else example
    public static void Test(int num) {
        int number = 10;

        if (number > 0)
            System.out.println("The number is positive.");

        if (number % 2 == 0)
            System.out.println("The number is even.");

        if (number % 5 == 0)
            System.out.println("The number is divisible by 5.");

        System.out.println("End of program.");
    }
    
    // complex nested if - else example
    public static void challenge(int num) {
        if (num > 0) { // 1
            if (num % 2 == 0) { // 2
                if (num % 3 == 0) {// 3
                    System.out.println("Number is positive, even, and divisible by 3.");
                } else { // 4
                    System.out.println("Number is positive, even, but not divisible by 3.");
                }
            } else {// 5
                System.out.println("Number is positive, odd.");
            }
        } else if (num == 0) { // 6
            System.out.println("Number is zero.");// 7
        } else {// 8
            System.out.println("Number is negative.");// 9
        }
    }
    /*
     * nums = -1 false: jump to line 6 else if and evaluate = line 9
     * nums = 0 false: jump to line 6 else if and evaluate = line 7
     * nums = 1 true: false: jump to line 5
     * nums = 2 true: true: false jump to line 4
     * nums = 3 true: false jump to line 5
     * nums = 4 true: true: false: jump to line 4
     * nums = 5 true: false: jump to line 5
     * nums = 6 true: true: true: Print statement executes
     */

}
