import java.util.Scanner;

public class p9 {
   public static void main(String [] args){
   
   
      Scanner input = new Scanner(System.in);
   
      int sum = 0;
      int i =0 ;
      double ave = 0;
   
      while (true){
      
         System.out.println(" enter a number ");
      
         int n = input.nextInt();
      
      
         if (  n == 0 ){ 
            break;
         }
      
        
         sum += n;
         i++;
        
      }
        
      System.out.println(" sum is "+ sum );
   
      ave = sum/ (i-1);
      System.out.println(" ave is" + ave);
   
        
   
   }

}