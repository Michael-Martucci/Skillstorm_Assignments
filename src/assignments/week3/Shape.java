package assignments.week3;
// create Shape class to act as parent
public class Shape {  

private String name = "";
private double length = 0;
private double height = 0;
final int numOfSides = 4; // number of sides should not be changed with these shapes
private double angle = 0;

// constructors
public Shape(){}

public Shape(String name, double length, double height, double angle){
this.name = name;
this.length = length;
this.height = height;
this.angle = angle;
}

// getters and setters
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getLength() {
    return length;
}
public void setLength(double length) {
    this.length = length;
}
public double getHeight() {
    return height;
}
public void setHeight(double height) {
    this.height = height;
}
public int getNumOfSides() {
    return numOfSides;
}
public double getAngle() {
    return angle;
}
public void setAngle(double angle) {
    this.angle = angle;
}

public double area(){ 
    return length * height;
}
// print to string
@Override
public String toString() {
    double area = area();
    return "Shape [name = " + name + ", length = " + length + ", height = " + height + ", numOfSides = " + numOfSides
            + ", angle = " + angle + ", area = " + area + "]";
}
}

