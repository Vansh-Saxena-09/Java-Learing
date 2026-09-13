// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class pali{
    public static int isEligible(int age){
        if(age > 18){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(isEligible(age) == 1){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
} 
