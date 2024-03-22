package assignments.week2;

public class PredictingLoops {

    public static void main(String[] args) {

        // Loop 1:
        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count += 1;
        }
        // Prints from 11 onward to Int overload due to the semi colon which end the
        // body
        // Loops 2:
        String[] people = { "Bob", "Sue", "Wendy", "Waldo", "Santa", "Nemo" };

        int wheresWaldo = -1;
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Waldo"))
                wheresWaldo = i;
        }

        System.out.println(wheresWaldo);
        /*
         * Prints 3, waldos initial idex is 3, since there it cannot initialize at -1
         * (int wheresWaldo = -1) so it waldos index stays at 3
         */

        // Loop 3
        boolean iInTeam = false;

        for (char c : "team".toCharArray()) {
            if (c == 'i')
                iInTeam = true;
        }

        System.out.println(iInTeam);
        // Prints false since there is no "i" in the char array

        // Loop 4
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
        /*
         * Prints odd numbers counting up to 10 since starts at 0 and increments
         * if i= %2 ==0 means if number is divisible by 2 jump and then continue
         * all even numbers modulus 2 are == to 0 since no remainder - but why/how does
         * it jump?
         */

        // Loop 5
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        /*
         * Prints even numbers 0 - 10 since i initial value is 0 and += 2 adds 2 to the
         * value
         * each time util it reaches 10 and is no longer less than 10
         */

        // Loop 6
        for (int i = 100; i < 0; i--) {
            System.out.println(i);
        }
        /*
         * prints nothing; for loops states i value is 100, and as long as i is less
         * than 0 decrement by 1 however that should be switched to i > 0 in order to
         * work
         */

        // Loop 7
        String[] birds = { "duck", "duck", "duck", "goose", "duck", "duck" };
        int countOfDucks = 0;

        for (String bird : birds) {
            if (bird.equals("goose")) {
                break;
            }
            countOfDucks++;
        }

        System.out.println("There are " + countOfDucks + " ducks.");
        /*
         * Prints "there are 3 ducks" since the enhanced for loop initiates value 0
         * and increments by 1 until the variable value "goose" is returned where it
         * triggers the break
         * and ends the iteration, triggering the print statement
         */

    }
}
