import java.util.Scanner;

public class p5 {

   public static void main( String [] args ) {
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("enter a number 0 -100");
      int num = input.nextInt();
   
   
      if ( num < 101 && num> -1 )
         System.out.println("the number is correct");
      
      else
         System.out.println("the number is non-correct");
   
   
   }

}