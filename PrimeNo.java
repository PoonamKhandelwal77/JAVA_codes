import java.util.Scanner;

class PrimeNo {
   public static void main(String[] args) {
      int a, i = 2, p = 0;
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter No.");
      a = obj.nextInt();
      while (i < a) {
         if (a % i == 0) {
            p = 0;
            break;
         } else
            p = 1;

         i++;
      }
      if (p == 1) {
         System.out.println(a + " is a prime no");
      }
      else
         System.out.println(a + " is not a prime no");
   }
}