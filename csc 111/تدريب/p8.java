import java.util.Scanner;

public class p8{
   public static void main(String[] args) {
   
   
      Scanner input = new Scanner(System.in);
   
           
   
      while ( true ){ 
      
      
         System.out.println(" Enter a number " );
      
         int n = input.nextInt();
      
      
      
         if ( n == 1)
            System.out.println(" Num is one " );
         
         
         else if ( n == 2)
            System.out.println(" Num is two " );
         
         else if ( n == 3)
            System.out.println(" Num is three " );
         
         else if ( n == 4)
            System.out.println(" Num is four " );
         
         else if ( n == 5)
            System.out.println(" Num is five " );
         
         
         else 
            break;
            
      }
      
   
   }
}
