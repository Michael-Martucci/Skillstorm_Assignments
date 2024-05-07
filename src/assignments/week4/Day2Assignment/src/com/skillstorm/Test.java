package assignments.week4.Day2Assignment.src.com.skillstorm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         System.out.print("Welcome, enter a radius for the circle: ");
        try{
         double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        } catch (InvaildSizeException e) {
            System.out.println(e.getMessage());
            System.out.println("Please use a number => 1");
            System.out.println();
            System.out.print("Please enter a radius for the circle: ");
            double radius = scanner.nextDouble();
            Circle circle2 = new Circle(radius);
        System.out.println(circle2);
        scanner.close();
}
}
}