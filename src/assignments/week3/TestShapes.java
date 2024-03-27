package assignments.week3;
// class with main to test building and comparing shapes
public class TestShapes {
    
public static void main (String ... args){
// create object from Shape class
Shape square = new Shape();
square.setName("Square");
square.setHeight(5.5);
square.setLength(5.5);
square.setAngle(90);
square.area();
System.out.println(square);
// Create object from Triangle class
Triangle triangle = new Triangle();
triangle.setName("Triangle");
triangle.setHeight(7);
triangle.setBase(3.5);
triangle.setAngle(45);
triangle.area();
System.out.println(triangle);
// more streamlined 
Shape rectangle = new Shape("rectangle", 10, 5, 90);
System.out.println(rectangle);

System.out.println(square.equals(rectangle));


}

}
