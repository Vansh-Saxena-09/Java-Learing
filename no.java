// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class pali{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num > 0){
                count++;
            }
        }while(true);
    }
}
