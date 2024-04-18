package assignments.week6.day4;

// imports
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CompareAthletes {


public static void main(String[] args){

    
 // list of athletes to compare
List<Athletes> athletes = new ArrayList<>(8);
athletes.add(new Athletes("Jack Nicklaus", 73, 595));
athletes.add(new Athletes("Lindsey Vonn", 82, 395));
athletes.add(new Athletes("Mikaela Shiffrin", 82, 232));
athletes.add(new Athletes("Novak Djokovic", 92, 280));
athletes.add(new Athletes("Rafael Nadal", 92, 304));
athletes.add(new Athletes("Roger Federer", 103, 367));
athletes.add(new Athletes("Serena Williams", 73, 240));
athletes.add(new Athletes("Tiger Woods", 82, 371));


Collections.sort(athletes, Collections.reverseOrder()); // reverse order providing
// System.out.printf("Sorted list elements: %s%n", athletes); // prints long form paragraph
athletes.forEach(System.out::println); // prints objects into list
 
}
}
