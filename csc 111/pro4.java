import java.util.Scanner;
public class pro4
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner (System.in);
   
      System.out.println("Enter first number");
      int num1 = input.nextInt();
   
      System.out.println("Enter second number");
      int num2 = input.nextInt();
   
      int sum = num1 + num2;
      System.out.println( "Sum =" + sum);
   
      int sub = num2 - num1; 
      System.out.println("sub = " + sub);
   
   }

}
