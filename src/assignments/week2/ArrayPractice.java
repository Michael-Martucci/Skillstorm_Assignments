package assignments.week2;
// import array utility//
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args){
        // Create array list of favorite foods//
        String[] favoriteFoods = {"Cheesesteaks", "Pizza", "Hoagies", "Tacos"}; 
        System.out.println("My favorite foods are, " + Arrays.toString(favoriteFoods));
        System.out.println(favoriteFoods[0]);
        // change of favorite foods//
        favoriteFoods[0] = "Grilled Chicken";
        favoriteFoods[1] = "Eggs";
        favoriteFoods[2] = "Protein Bars";
        favoriteFoods[3] = "Peanut Butter";
        System.out.println("Now my favorite foods are, " + Arrays.toString(favoriteFoods));
        // create new array of favorite foods adding to the previous//

    String [] newFavoriteFoods = Arrays.copyOf(favoriteFoods, 6);
        newFavoriteFoods [4] = "Dinosaur Chx Nuggets";
        newFavoriteFoods [5] = "Yogurt";
        System.out.println("New favorite foods also include, " + Arrays.toString(newFavoriteFoods));
// call and test getLastElement method//
int[] test1 = {1, 2, 3};
int[] test2 = {1};
int[] test3 = {};
int[] test4 = null;
        int lastElement = getLastElement(test1);
        System.out.println("The laset element in test1 is: " + lastElement);
        int lastElement2 = getLastElement(test2);
        System.out.println("The last element in test2 is: " + lastElement2);
        int lastElement3 = getLastElement(test3);
        System.out.println("The laset element in test3 is: " + lastElement3);
        int lastElement4 = getLastElement(test4);
        System.out.println("The last element in test4 is: " + lastElement4);
} // end main method
// creat method called getLasElement//
public static int getLastElement(int[] test) {
    // guard clauses//
    if (test == null)
        return 0;
    if (test.length == 0)
        return 0;
    else
    return test[test.length -1];
} 
}// end getlastElement method
// end class - start adding this to not loose track of brackets



