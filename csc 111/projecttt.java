import java.util.Scanner;

//  fisrt class this shoulde be in another file and start with public
class key {   // create abtr that represent key in the system , each obj hava a uniqce id
   public static int numKeys =0; // use static to track the number
   private int ID;
   private String original;
   private String code;
   private boalean isSet;
   
   
   //defalt constructor
   public Key() {
      ID = ++numkeys; 
      oruginal = " ";
      code = " ";
      isSet = false; 
   }
 
   
//methods 

   public boolean setKey( String o , String c ) { // using a gneral function to ckeck valid key
      if ( validkey (o ,c)) { // case 1
         original = o; 
         code = c;
         isSet = true;
         return true;
      } else {
         original = " ";
         code = " ";
         isSet = false;
         return false;
      }
   }


// same function to check the length and each latter by using replacefirst
   private boolean validKey(String o, String c) { // case 1
      if (o == null || c == null) 
         return false;
      if (o.length() != c.length()) {
         return false;
      }
   
      String tempCode = c;
      for (int i = 0; i < o.length(); i++) {
         char ch = o.charAt(i);
         if (tempCode.indexOf(ch) != -1) {
            tempCode = tempCode.replaceFirst(String.valueOf(ch), "");
         } else {
            return false;
         }
      }
      return tempCode.isEmpty();
   }

// display the key and id status
   public void displayMe() {
      System.out.println("+-------+");
      System.out.println("| Key#" + ID + " |");
      if (!isSet) {
         System.out.println("|not set|");
         System.out.println("+-------+");
      } else {
         System.out.println("|set    |");
         System.out.println("|---+---|");
         System.out.println("| O | C |");
         System.out.println("|---+---|");
         for (int i = 0; i < original.length(); i++) {
            System.out.println("| " + original.charAt(i) + " | " + code.charAt(i) + " |");
         }
         System.out.println("+-------+");
      }
   }

    // Getter because we use private abt
   public int getID() { 
      return ID; }
   public boolean isSet() { 
      return isSet; }
   public String getOriginal() { 
      return original; }
   public String getCode() { 
      return code; }
}


//done fist class

//second class this shoulde be in another file and start with public
class SecureSentence {
   private String sentence;          
   private String encryptedSentence; 
   private String decryptedSentence; 
   private Key keyUsed;             
   private boolean encrypted; // is it enc or dec

    // Constructor
   public SecureSentence() {
      sentence = "";
      encryptedSentence = "";
      decryptedSentence = "";
      keyUsed = null;
      encrypted = false;
   }
// methods

 // input
   
   public void setSentence(String s) {
      sentence = s;
      encryptedSentence = "";
      decryptedSentence = "";
      encrypted = false;
      keyUsed = null;
   }

// stored the sentence and the key  if the sentens enc
   public void setSentence(String s, Key key) { 
      sentence = s;
      keyUsed = key;
      encrypted = true;
   }

// case 5 
   public void encrypt(Key key) { 
      if (key == null || !key.isSet()) {
         System.out.println("\nERROR! key has not been set");
         return;
      }
   
      if (sentence.equals("")) {
         System.out.println("\nERROR! sentence has not been set");
         return;
      }
   
      String original = key.getOriginal();
      String code = key.getCode();
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
      encrypted = true;
      keyUsed = key;
   
      System.out.println("\nYour encrypted sentence is: " + sentence);
   }

    // case 6
   public void decrypt() {
      if (keyUsed == null || !keyUsed.isSet()) {
         System.out.println("\nERROR! key has not been set");
         return;
      }
   
      if (sentence.equals("")) {
         System.out.println("\nERROR! sentence has not been set");
         return;
      }
   
      String original = keyUsed.getOriginal();
      String code = keyUsed.getCode();
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
      encrypted = false;
   
      System.out.println("\nYour decrypted sentence is: " + sentence);
   }

    //display the current sentence
   public void displayMe() {
      if (sentence.equals("")) {
         System.out.println("\nERROR! sentence has not been set");
      } else {
         System.out.println("\nCurrent sentence: " + sentence);
         System.out.println("Encrypted: " + encrypted);
         if (keyUsed != null)
            System.out.println("Key used: Key#" + keyUsed.getID());
      }
   }

    // Getter 
   public boolean isEncrypted() {
      return encrypted;
   }

   public String getSentence() {
      return sentence;
   }
}

// done 



// main class


public class encryptAndDecrypt
{
   public static void main (String[]args)
   {
      Scanner scanner = new Scanner(System.in);
   
      int pin = 0;
      int dummyPin;
      boolean exit = true; // control countie of the program
      
      //keys
      key key1 = new key();
      key key2 = new key();
      key key3 = new key();
      
      /*here is another way to write the keys
      Key[] keys = { new Key(), new Key(), new Key() };*/
   
      //obj for the sentences
      SecureSentence currentSentence = new SecureSentence();
   
      
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
         
         
         /* ask for pin from user and check it
            ask for siwch key you want to change
            read from the user original and code*/
            
            case 1: 
               System.out.print("\nEnter PIN to set/change the key: ");
               dummyPin = scanner.nextInt();
            
               if (dummyPin == pin) {
                  System.out.print("\nWhich key (1-3) do you want to set/change? ");
                  int keyNum = scanner.nextInt();
               
                  if (keyNum < 1 || keyNum > 3) {
                     System.out.println("Invalid key number!");
                     break;
                  }
               
                  System.out.print("\nEnter original key: ");
                  String dummyOriginal = scanner.next();
                  System.out.print("Enter code key: ");
                  String dummyCode = scanner.next();
               
                  if (keys[keyNum - 1].setKey(dummyOriginal, dummyCode)) { // here chack from the class key by using function validkey 
                     System.out.println("\nKey has been set successfully (same letters, any order)");
                  } else {
                     System.out.println("\nERROR! Both keys must contain the same letters (order doesn't matter)");
                  }
               } else {
                  System.out.println("\nPIN is invalid");
               }
               break;
               
               /* ask pin from uear
                  if pin crrocet then do the keys
                  for each obj, call dispalyme from class key
                  if pin wrong then print PIN IS INVAILD*/
                 
            case 2:
               System.out.print("\nEnter PIN to view the key: ");
               dummyPin = scanner.nextInt();
            
               if (dummyPin == pin) {
                  System.out.println("\nKeys status:");
                  for (Key k : keys) {
                     k.displayMe();
                  }
               } else {
                  System.out.println("\nPIN is invalid");
               }
               break;
               
             
         /* ask to write a sentence
            stroted inside obj currentSentence and delete any previous enc*/
            
            case 3: 
               System.out.print("Enter your sentence: ");
               String s = scanner.nextLine();
               currentSentence.setSentence(s);
               System.out.println("\nYour sentence has been set");
               break;
         
         /* call function displayme from class SecureSentece 
            output if there is no setens\ there is */
            case 4:
               currentSentence.displayMe();
               break;           
               
             // ask you which key you want to use for enc then call function encryptkey from class securesentence
           
            case 5:
               System.out.print("\nWhich key (1-3) do you want to use? ");
               int kNum = scanner.nextInt();
               if (kNum < 1 || kNum > 3) {
                  System.out.println("Invalid key number!");
                  break;
               }
               currentSentence.encrypt(keys[kNum - 1]);
               break;
            
            /* call function decrypt from class securesentence
               chack if the key is uesd and ckeck the senctence by letter letter 
               if the letter there replceit if not keep it */
                  
            case 6:
               currentSentence.decrypt();
               break;
            
            
            /* print bye sentence
               change value exit to false and end while loop
               end the progrem*/
               
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

