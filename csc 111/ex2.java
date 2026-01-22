import java.util.Scanner;
public class ex2
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.println( "Enter legth");
      double legth = input.nextDouble();
   
      System.out.println("Enter wigth");
      double wigth = input.nextDouble();
   
      double area = legth*wigth;
      System.out.println(" area = " + area);
   
   }

}