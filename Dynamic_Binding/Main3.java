/*Explaination: This program demonstrates runtime polymorphism using dynamic method dispatch. 
                A Shape reference is used to point to Circle and Rectangle objects, 
                and the correct area() method is invoked based on the object type at runtime.*/
package Dynamic_Binding;

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle: l * b");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();  // Calls Circle's area()

        s = new Rectangle();
        s.area();  // Calls Rectangle's area()
    }
}

