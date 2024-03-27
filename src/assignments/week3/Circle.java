package assignments.week3;
// declare class and instance variables
public class Circle {

    private double radius = 0;

    // instance no args
    public Circle() {
    }
    // constructor with paramteres
    public Circle(double radius) {
        this.radius = radius;
    }
    // set radius of circle
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // equation to calcualate area
    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }
 // equation to calculate diameter
    public double getDiameter() {
        return 2 * radius;
    }
// equation to calculate circumference
    public double getCircumference() {

        return 2 * Math.PI * radius;
    }
 // override print statement so outputs as string
    @Override
    public String toString() {
        double area = getArea();
        double diamater = getDiameter();
        double circumference = getCircumference();
        return "this circle has an area of:" + area + "\nthe diameter is: " + diamater +
        "\nand the circumference is: " + circumference;
    }
}
