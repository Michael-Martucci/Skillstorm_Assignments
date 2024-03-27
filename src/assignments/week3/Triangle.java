package assignments.week3;
// create triangle child class
public class Triangle extends Shape {
        String name = "";
        double base = 0;
        double height = 0;

// constructor
public Triangle(){}
public Triangle(String name, double base, double height) {
    this.name = name;
    this.base = base;
    this.height = height;
    }

// getters and setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getHeight() {
    return height;
}

public void setHeight(double height) {
    this.height = height;
}
// override area method
@Override
public double area(){
    return 0.5* base * height;
}
// print to string
@Override
public String toString() {
    double area = area();
    return "Triangle [name = " + name + ", base = " + base + ", height = " + height + ", area = " + area + "]";
}
// attempt to add .equals method

public boolean compareShapes(double x, double y){
    if (x != y);
    return false;

}

}

