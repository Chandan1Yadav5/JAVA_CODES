//In this program, we demonstrate single inheritance by creating a parent class Operation with a method calculate(). 
//A child class Addition inherits from Operation and overrides the calculate() method to perform addition.
package Single_Inheritance;

// Parent class
class Operation {
    void calculate() {
        System.out.println("Parent class: Performing generic calculation...");
    }
}

// Child class
class Addition extends Operation {
    @Override
    void calculate() {
        int a = 10, b = 20;
        System.out.println("Child class: Addition = " + (a + b));
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        Operation op = new Addition();  // Polymorphism
        op.calculate();  // Calls child method
    }
}

