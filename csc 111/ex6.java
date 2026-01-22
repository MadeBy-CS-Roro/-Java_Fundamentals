import java.util.Scanner;
public class ex6 
{
   public static void main(String[]args)
   {
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter your wight: ");
      double wight = input.nextDouble();
   
      System.out.println("Enter your height: ");
      double height = input.nextDouble();
     
      double heightInMeter = height / 100;
      double BMI = wight/ (heightInMeter*heightInMeter) ;
      System.out.println( BMI);
   
      if (BMI < 18.5)
         System.out.println("You are so skiny");
       
      else if (BMI >= 18.5 && BMI < 24.9 )
         System.out.println("You wight is normal");
         
      else if (BMI >= 25.0  && BMI < 29.9)
         System.out.println("You are fat");
                
      else 
         System.out.println("You are so fat");
      
   }


}

   
