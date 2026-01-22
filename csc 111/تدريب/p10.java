import java.util.Scanner;

public class p10 {
   public static void main(String [] args ){
   
      Scanner input = new Scanner(System.in);
   
   
      System.out.println(" Enter a number ");
      
      int n = input.nextInt();
   
      int max = n;
      int min = n;
      int i =0;
      
      while (true){
      
         int r = input.nextInt();
         
         if( r ==0 ) {
         
            break; }
         
      
      
         if ( r < min ){
            min = r;
         }
            
         
         if ( max <r ){
            max = r;
         }   
            
         
         
                  
      }
         
      
       
      System.out.println("the max is "+ max);
      
      System.out.println(" the min is "+ min);
      
       
   
   
   
   }

}
