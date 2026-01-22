import java.util.Scanner;

public class ex13
{
   public static void main(String[]args)
   {
   
      Scanner n = new Scanner(System.in);
   
      int num = n.nextInt();
      int max = num;
      while ( num!= -1) {
         if ( max < num)
            max = num;
         num = n.nextInt();
      }
   
      System.out.println( " Max= " + max);
   
   }
   
}