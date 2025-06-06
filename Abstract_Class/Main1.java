/*Explaination : This program demonstrates abstract classes and method overriding. 
                 An abstract class Shape contains an abstract method area(), which is implemented by its subclasses Circle and Rectangle.*/

package Abstract_Class;
abstract class Shape {
    abstract void area();  // Abstract method
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10, breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        r.area();
    }
}
