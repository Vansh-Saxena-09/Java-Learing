import java.util.Scanner;

public class conditions2 {
    public static void main(String[] args) {
        // Using try-with-resources for safe and automatic closing of Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int x = sc.nextInt();

            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}