import java.util.Scanner;
public class ex7
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter your grade : ");
      double grade = input.nextDouble();
   
      if ( grade >= 95)
         System.out.println(" your grade is A+");
      
      else if ( grade >= 90 && grade < 95)
         System.out.println(" your grade is A");
      
      
      else if ( grade >= 85 && grade < 90)
         System.out.println(" your grade is B+");
         
      
      else if ( grade >= 80 && grade < 85)
         System.out.println(" your grade is B");
      
      
      else if ( grade >= 75 && grade < 80)
         System.out.println(" your grade is C+");
         
      
      else if ( grade >= 70 && grade < 75)
         System.out.println(" your grade is C");
      
      else if ( grade >= 65 && grade < 70)
         System.out.println(" your grade is D+");
      
      
      else if ( grade >= 60 && grade < 65)
         System.out.println(" your grade is D");
      
      
      else
         System.out.println(" your grade is F");
        
   }



}
