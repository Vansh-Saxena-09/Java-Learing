import java.util.*;
public class roh{
    public static int calculateFactorial(int n){
      if(n<0){
         System.out.println("Invalid Input");
         return 0;
      }
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of "+n+" is "+factorial);
    }
}  
