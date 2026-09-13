// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class roh{
    public static int circumference(int radius){
        return 2 * 3 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(circumference(radius));
    }
}
