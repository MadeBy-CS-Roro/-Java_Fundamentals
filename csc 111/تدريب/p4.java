import java.util.Scanner;

public class p4 {
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
   
      System.out.println("Enter the fist num");
      double n1 = input.nextDouble();
   
      System.out.println("Enter the second num");
      double n2 = input.nextDouble();
   
      if ( n1> 0 && n2 >0 )
         System.out.println("Both of the number are positive");
      
      else if (n1< 0 && n2<0 )
         System.out.println("Both of the number are negative");
      
      else if ( n1 == 0 && n2 == 0)
         System.out.println("Both of the number are zero");
      
      else 
         System.out.println("Both of the number are defrint");
   
   
   
   
   
   }

}