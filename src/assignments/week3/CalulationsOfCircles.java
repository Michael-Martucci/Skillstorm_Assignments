package assignments.week3;

public class CalulationsOfCircles {

    public static void main (String ... args){
        // create object circle 1
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.getArea();
        circle1.getDiameter();
        circle1.getCircumference();
        System.out.println("> Circle 1 properties");
        System.out.println();
        System.out.println(circle1); //trim white space
        System.out.println();

        Circle circle2 = new Circle();
        circle2.setRadius(2);
        circle2.getArea();
        circle2.getDiameter();
        circle2.getCircumference();
        System.out.println("> Circle 2 properties");
        System.out.println();
        System.out.println(circle2);

    }
}
    
