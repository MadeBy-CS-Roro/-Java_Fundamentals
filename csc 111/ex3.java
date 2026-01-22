import java.util.Scanner;

public class ex3 
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.println(" Enter r ");
      double r = input.nextDouble();
      double area = r*r*3.14;
   
      System.out.println(" area = " + area);
   }

}