import java.util.Scanner;

public class ex12
{
   public static void main (String[]args)
   {
      Scanner n = new Scanner(System.in);
   
      int num = n.nextInt();
   
      while ( num!= -1){ 
         System.out.print( num);
         num = n.nextInt();
      }
       
   }
     
}