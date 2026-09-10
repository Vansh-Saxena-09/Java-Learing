public class roh{
public static void main(String[] var0) {
      new Scanner(System.in);
      byte var2 = 5;

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 <= var2 - var3; ++var4) {
            System.out.print(" ");
         }

         for(int var5 = 1; var5 <= var3; ++var5) {
            System.out.print(var3 + " ");
         }

         System.out.println();
      }

   }
 }
}
