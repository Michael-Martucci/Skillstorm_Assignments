package assignments.week2;
public class findMaxArrays {
public static void main(String[] args){

// creates a custome int array
int[] example1 = {1, 4, 6, 8};
// create a variable to store the number found by findMax method
int largestNumber = findMax(example1);
// prints that number
System.out.println(largestNumber);
int[] example2 = {8};
int largestNumber2 = findMax(example2);
System.out.println(largestNumber2);
int[] example3 = {};
int largestNumber3 = findMax(example3);
System.out.println(largestNumber3);
int[] example4 = null;
int largestNumber4 = findMax(example4);
System.out.println(largestNumber4);
int[] example5 = {4, -3, -2, -1, -5};
int smallestNumber = findMin(example5);
System.out.println(smallestNumber);

}

public static int findMax(int [] highest){ /* return type integer - argument is integer array
    name of the array is highest - should probably be named better*/
if (highest == null || highest.length == 0){
    return 0;
}
    // initialize a variable and assign it the first value of the elemeent in the array 
int max = highest[0];
 /*int x = 0 starts the search for the highest number at 0 (loop counter)
  x > highest.length (condition) meaning will continue searching as long as x > 0
  . length allows to only search until the last element
  x++ moving to teach next element in the array*/     
    for (int x = 0; x < highest.length; x++){
        //checks if x is greater than the highest number
 if (highest[x] > max) {
    //once the highest number is found it will sbe stored in the variable max
    max = highest[x];
    // return 0;
}
}
// returns the max variable
return max;
}// attempting to find min number which includes negatives in the array
public static int findMin(int [] lowest){
    int min = lowest[0];
    for (int y = 1; y < lowest.length; y++){ // i had y-- initially and it was not working. y++ is correct here
        if (lowest[y] < min) {
            min = lowest[y];
            
        }
    }
    return min; 
}
}

