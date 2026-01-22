import java.util.Scanner;

public class ex5
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      System.out.println( " Enter a amount 0.01-0.99");
      int amount = input.nextInt();
   
      int half = amount/50;
      amount = amount%50;
      System.out.println( "Half = " + half);
      
      int quarter = amount/25;
      amount = amount%25;
      System.out.println( " Qnaters = " + quarter);
   
      int qirsh = amount/10; 
      amount = amount%10;
      System.out.println(" Qirshs = " + qirsh);
     
      int halals = amount;
      System.out.println( "Halals = " + halals);
   
   }

}