import java.util.Scanner;

public class p3{
   public static void main(String [] args){
   
      Scanner input = new Scanner(System.in);
   
      System.out.println(" EANTER A NUM ");
      double n = input.nextDouble();
   
      if ( n > 0 )
         System.out.println("NUM is positive");
      
      else if ( n < 0 )
         System.out.println("NUM is negative");
      
      else 
         System.out.println("NUM is zero");
   
   
   
   }

}