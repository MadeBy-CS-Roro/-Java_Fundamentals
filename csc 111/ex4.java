import java.util.Scanner;

public class ex4 
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter tempareture " );
      double c = input.nextDouble();
   
      double f = (9/5.0)*c + 32.0;
   
      System.out.println( " tempereture in F = " + f);
   }
 
}