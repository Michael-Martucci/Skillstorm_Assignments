package assignments.week3;

public class methodsAndLoopsWk3 {

public static void main(String[] args) {
    

  printOdds(); // counts 1 to 101 by 2
    addSum(); // ads sum of numbers 1-10
    // call method to find the factorial of 10
    int n = 10;
    System.out.println(factorial(n));


}
// method to print odd numbers 1 - 101
    public static void printOdds(){

    for (int i = 1; i <= 101; i++){
        if (i % 2 == 0){
    continue;
        }
        System.out.println(i);
    }
 }
 // method to add numbers 1-10
 public static void addSum(){
    int [] newArray={1,2,3,4,5,6,7,8,9,10};
    int sum = 0;
    for (int i : newArray)
        sum += i;
    System.out.println(sum);
    
 }
// method to find factorial
    public static int factorial(int n){

   int result = 1;
   for (int i = 1; i <=10; i++)
        result *= i;
        return result;
    }
        // method to reverse the characters of a string
// public static String reverse(String s) {
//     String reversed = new String();

//     for (String i = str.length() -1; i <= 0; i--)
    
    
//     return reversed;
// }

// method to capitolize every other letter in a string
// public static String stickyCaps(String s) {


}


    

