/*This program demonstrates method overloading, where multiple calculate() methods perform:

Addition (int, int)

Subtraction (double, double, String)

Multiplication (float, float, int)

Division (double, double, char)*/

package Overloading;

class Calculator {

    // Addition
    void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    // Subtraction
    void calculate(double a, double b, String op) {
        if (op.equals("sub"))
            System.out.println("Subtraction: " + (a - b));
    }

    // Multiplication
    void calculate(float a, float b, int opCode) {
        if (opCode == 1)
            System.out.println("Multiplication: " + (a * b));
    }

    // Division
    void calculate(double a, double b, char symbol) {
        if (symbol == '/')
            if (b != 0)
                System.out.println("Division: " + (a / b));
            else
                System.out.println("Cannot divide by zero");
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(10, 20);                         // Addition
        calc.calculate(50.5, 20.2, "sub");               // Subtraction
        calc.calculate(6.0f, 3.0f, 1);                   // Multiplication
        calc.calculate(10.0, 2.0, '/');                  // Division
    }
}

