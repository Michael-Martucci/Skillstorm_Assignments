package assignments.week1;

public class AssignmentTwo {

    // Calculating equations through Java's arithmatic rules

    public static void main(String[] args) {

        // Pre defined variables

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14;

        // Using remainder operator
        System.out.println("remainder operators");
        System.out.println();
/* these could have been written using int result = equation
 * 
 * int result = (5 + 7 % 6)
 * result = (12 % 6)
*/
        q1 = (5 + 7 % 6);
        System.out.println(q1);
        q2 = (12 % 6);
        System.out.println(q2);
        q3 = (6 % 12);
        System.out.println(q3);
        q4 = (3 % 5);
        System.out.println(q4);
        q5 = (5 % 3);
        System.out.println(q5);
        q6 = (5 % 5);
        System.out.println(q6);
        q7 = (1 % -2); // modules always takes on the sign of the first argument//
        // when using negatives with % mod it becomes a remainder 
        System.out.println(q7);
        q8 = (-1 % 2);
        System.out.println(q8); // vs when using math.floorMod() it become mod and takes on second argument
        q9 = (-1 % -2);
        System.out.println(q9);
        q10 = (0 % 2); // will always equal 0
        System.out.println(q10);
        // q11 = (2 % 0); // will result in undefined when trying to divide by zero
        System.out.println("cannot divide by zero!");
        q12 = (6 * 2 % 6);
        System.out.println(q12);
        q13 = (12 % 4);
        System.out.println(q13);
        q14 = (7 % 3 % 2);
        System.out.println(q14);
        System.out.println("q1:" + q1 + "\n" + "q2:" + q2 + "q3" + q3 + "q4" + q4 + "q5" + q5);

        // order of operations questions //
        System.out.println();
        System.out.println("order of operations");

        // pre defined variables //
        int x1, x2, x3, x4, x5;

        x1 = (10 - 12 * 2);
        System.out.println(x1);
        x2 = (5 * (3 - 2));
        System.out.println(x2);
        x3 = (5 + 2 * 3);
        System.out.println(x3);
        x4 = (7 + 2 * 3 / 5 - 1);
        System.out.println(x4);
        x5 = (18 / 3 % 7 * (4 + 1));
        System.out.println(x5);

        // integer atithmatic //
        System.out.println();
        System.out.println("Integer Arithmatic");
        int z1, z2, z3, z4, z5, z6, z7, z8, z9, z10;

        z1 = 15 / 3 / 5;
        System.out.println(z1);
        z2 = 1 / 2;
        System.out.println(z2);
        z3 = 3 / 4;
        System.out.println(z3);
        z4 = 4 / 3;
        System.out.println(z4);
        z5 = Integer.MAX_VALUE + 1;
        System.out.println(z5);
        z6 = Integer.MIN_VALUE - 1;
        System.out.println(z6);
        z7 = Integer.MAX_VALUE + Integer.MIN_VALUE;
        System.out.println(z7);
        z8 = Short.MAX_VALUE + 1;
        System.out.println(z8);
        z9 = Short.MIN_VALUE - 1;
        System.out.println(z9);
        z10 = Short.MAX_VALUE + Short.MIN_VALUE;
        System.out.println(z10);

        System.out.println();
        // Type casting questions
        System.out.println("Type casting");

        int y;
        y = (int) 7.9 - 3;
        System.out.println(y);
        int y1;
        y1 = (int) 84.3 / (int) 2.8;
        System.out.println(y1);
        byte b1;
        b1 = (byte) 1000 - 10; /*correctly written question: byte answer = (byte) 1000 - 10
        incompatible. 1000 becomes a byte, then becomes a string with the -, cant subject from a string


         */
        System.out.println(b1);
        short s1;
        s1 = (short) 100000;
        System.out.println(s1);
        long l1 = (long) 10 + -10;
        System.out.println(l1);

        /*
         * Well my results vs java results were not great.
         * This will be an area of focus for my evening studies. Some surprises I had
         * was in L36, I received an error
         * that it could not be divided by zero. I'm sure its something minor I am
         * missing
         * and I will find the answer as I study later.
         * Hopefully this code is beginning to look a bit cleaner and easier to follow
         */

    }

}
