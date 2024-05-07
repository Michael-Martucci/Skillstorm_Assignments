// package assignments.week6;


// public class tryCatch {

//     public static void main(String[] args) {

//         // single try/catch - null pointer - check length of strings
//         try {
//             String str = null;
//             System.out.println(str.length());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException occurred: " + e.getMessage()); // prints default message from
//                                                                                     // throwable

//             System.err.println("Value is empty, cannot divide by zero");
//         }

//         // multiple catch example - equations dividing a number by string length
//         try {
//             String str = null;
//             int length = str.length(); // This may throw NullPointerException
//             int result = 10 / length; // This may throw ArithmeticException
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) { // first catch
//             System.out.println("ArithmeticException occurred: " + e.getMessage());
//         } catch (NullPointerException e) { // second catch
//             System.out.println("NullPointerException occurred: " + e.getMessage()); // prints default message
//         } // could continue adding catch blocks as needed

//         // alternative syntax for catching multiple exaeptions
//         try {
//             String str = null;
//             int length = str.length();
//             int result = 10 / length;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException | NullPointerException e) { // first catch
//             System.out.println("ArithmeticException occurred: " + e.getMessage());
//         }

//         finally { // finally block will always run
//             System.err.println("There has been an error");
//         }

//     }

//     private static void divide(int i, int j) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'divide'");
//     }
// }
