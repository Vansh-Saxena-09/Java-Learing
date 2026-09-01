import java.util.*;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the first no.");
            int a = sc.nextInt();
            System.out.println("enter the second no.");
            int b = sc.nextInt();
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> System.out.println("Addition = " + (a + b));
                case 2 -> System.out.println("Subtraction = " + (a - b));
                case 3 -> System.out.println("Multiplication = " + (a * b));
                case 4 -> System.out.println(b != 0 ? "Division = " + (a / b) : "Cannot divide by zero");
                case 5 -> System.out.println(b != 0 ? "Modulo = " + (a % b) : "Cannot modulo by zero");
                default -> System.out.println("Invalid choice");
            } 

        }
    }
}
