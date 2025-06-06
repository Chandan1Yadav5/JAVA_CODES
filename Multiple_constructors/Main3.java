package Multiple_constructors;

class Calculator {

    int a, b;

    // Constructor 1
    Calculator() {
        this.a = 0;
        this.b = 0;
        System.out.println("Values set to 0: a = " + a + ", b = " + b);
    }

    // Constructor 2
    Calculator(int a, int b) {
        System.out.println("Addition from constructor: " + (a + b));
    }

    // Constructor 3
    Calculator(int a, int b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Addition: " + (a + b));
                break;
            case "subtract":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "multiply":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Division: " + ((double) a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        new Calculator();                              // No-arg
        new Calculator(10, 5);                          // Two-arg
        new Calculator(12, 4, "multiply");              // Three-arg
    }
}

