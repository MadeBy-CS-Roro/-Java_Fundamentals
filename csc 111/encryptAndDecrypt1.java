/* Students names: Jumana Rema
   Students IDs: 
   Section numbers: ??
   Lab instructor's name: haifa  
*/
import java.util.Scanner;

public class encryptAndDecrypt1
{
   public static void main (String[]args)
   {
      Scanner scanner = new Scanner(System.in);
   
      int pin = 0;
      int dummyPin;
      String original = "";
      String dummyOriginal = "";
      String code = "";
      String dummyCode = "";
      String sentence = "";
      String encryptedSentence = "";
      String decryptedSentence = "";
      boolean exit = true;
    
      System.out.println("Welcome to the encryption/decryption system!");
      System.out.print("Please enter a 4 digit PIN: ");
      
      // do-while loop for setting the PIN number
      do {
         dummyPin = scanner.nextInt();
         if (dummyPin >= 1000 && dummyPin <= 9999) {
            System.out.println("\nPIN has been set");
            pin = dummyPin;
         } else {
            System.out.print("\nERROR! Please enter a 4 digit PIN that doesn't start with zero: ");
         }
      } while (pin == 0); 
   
      // menu
      while (exit == true) {
         System.out.println("\nMENU:\n");
         System.out.println("1- Set/Change the key");
         System.out.println("2- Display the key");
         System.out.println("3- Enter a sentence");
         System.out.println("4- Display the current sentence");
         System.out.println("5- Encrypt the sentence and display it");
         System.out.println("6- Decrypt the sentence and display it");
         System.out.println("7- Exit the system");
         System.out.print("\nPlease enter the task number you want to start: ");
      
         int taskNum = scanner.nextInt(); 
         scanner.nextLine(); 
      
         switch (taskNum) {
         
            case 1: 
               System.out.print("\nEnter PIN to set/change the key: ");
               dummyPin = scanner.nextInt();

               if (dummyPin == pin) {
                  System.out.print("\nEnter original key: ");
                  dummyOriginal = scanner.next();
                  System.out.print("Enter code key: ");
                  dummyCode = scanner.next();

                  // يتحقق إنهم نفس الطول
                  if (dummyOriginal.length() == dummyCode.length()) {
                     String tempCode = dummyCode;
                     boolean sameLetters = true;

                     for (int i = 0; i < dummyOriginal.length(); i++) {
                        char c = dummyOriginal.charAt(i);
                        if (tempCode.indexOf(c) != -1) {
                           tempCode = tempCode.replaceFirst(String.valueOf(c), "");
                        } else {
                           sameLetters = false;
                           break;
                        }
                     }

                     if (sameLetters && tempCode.isEmpty()) {
                        System.out.println("\nKey has been set successfully (same letters, any order)");
                        original = dummyOriginal;
                        code = dummyCode;
                     } else {
                        System.out.println("\nERROR! Both keys must contain the same letters (order doesn't matter)");
                     }
                  } else {
                     System.out.println("\nERROR! The keys must have the same length");
                  }
               } else {
                  System.out.println("\nPIN is invalid");
               }
               break;
               
            case 2:
               if (original.equals("") && code.equals("")) {
                  System.out.println("\nERROR! key has not been set");
                  break;
               }
            
               System.out.print("\nEnter PIN to view the key: ");
               dummyPin = scanner.nextInt();
            
               if (dummyPin == pin) {
                  System.out.println("\nThe original key is: " + original);
                  System.out.println("The code key is: " + code);
               } else {
                  System.out.println("\nPIN is invalid");
               }
               break;
         
            case 3: 
               System.out.print("Enter your sentence: ");
               sentence = scanner.nextLine();
               System.out.println("\nYour sentence has been set");
               break;
         
            case 4:
               if (sentence.equals("")) {
                  System.out.println("\nERROR! sentence has not been set");
                  break;
               } else {
                  System.out.println("\nYour most recent sentence is: " + sentence);
               }
               break;           
               
            case 5:
               if ((original.equals("") && code.equals("")) || sentence.equals("")) {
                  if (original.equals("") && code.equals("")) {
                     System.out.println("\nERROR! key has not been set");
                  }   
                  if (sentence.equals("")) {
                     System.out.println("\nERROR! sentence has not been set");
                  }
                  break;
               }            
               encryptedSentence = "";
               for (int i = 0; i < sentence.length(); i++) {
                  char sentenceChar = sentence.charAt(i);
                  int indx = original.indexOf(sentenceChar);
                  
                  if (indx != -1) {
                     encryptedSentence = encryptedSentence + code.charAt(indx);
                  } else {
                     encryptedSentence = encryptedSentence + sentenceChar;
                  }
               }
               sentence = encryptedSentence;
               System.out.println("\nYour encrypted sentence is: " + sentence);
               break;
               
            case 6:
               if ((original.equals("") && code.equals("")) || sentence.equals("")) {
                  if (original.equals("") && code.equals("")) {
                     System.out.println("\nERROR! key has not been set");
                  }   
                  if (sentence.equals("")) {
                     System.out.println("\nERROR! sentence has not been set");
                  }
                  break;
               }
               
               decryptedSentence = "";
               for (int i = 0; i < sentence.length(); i++) {
                  char sentenceChar = sentence.charAt(i);
                  int indx = code.indexOf(sentenceChar);
                  
                  if (indx != -1) {
                     decryptedSentence = decryptedSentence + original.charAt(indx);
                  } else {
                     decryptedSentence = decryptedSentence + sentenceChar;
                  }
               }
               sentence = decryptedSentence;
               System.out.println("\nYour decrypted sentence is: " + sentence); 
               break;
            
            case 7: 
               System.out.println("\nThank you for using our encryption/decryption system! Goodbye.");
               exit = false;
               break;
            
            default:
               System.out.println("ERROR! invalid task number, please enter a number between 1 and 7");
         } 
      } 
   }
}