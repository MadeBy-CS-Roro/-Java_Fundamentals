class CreditCardAcc {

private String cardNo;
private String name;
private double pLimit;
private double balance;


class CreditCardAcc {
   cardNo = "0000";
   name = "Unknown";
   pLimit = 1000;
   balance = 0;
   interestRate = 2;
}

public void setCrediCardAcc( String n , string cNo ,  double balance , double pLimit ,double interestRate ){
 
   this.name =  n;
   this.cardNo = cNo;
   this.pLimit = pLimit;
   this.balance = balance;
   this.interestRate = interestRate;
   
}

public String getHolderName()
  
   return name ;
}


public String getCardNum() {
   
   return cardNo ;
}



public double getpayLimit() {
   
   return pLimit;
}



public double getbalance() {
   
   return balance;
}



public double getinterestRate() {
   
   return interestRate ;
}



public boolean purchase(double amount){

   double amount;
   double sum = amount + balance;
   
   if (sum <= limit){
      balance += amount;
      System.out.println(" succeful payment ");
      return true;
    } 
      
   else{ 
     System.out.println(" Tarnsection declined ");
     return false;
     }
   
   
}



public void pay(){
          
   if ( amount > 0 ) {
        balcane -= amount;
   } 
      if ( balance < 0) 
      balance = 0 ;
     
  
}      
   

   
     

public void applyInterest() {

    
   double applyInterest = balacne +( balcance * intersRate / 100);

   
}


public void printInfo(){

      System.out.println("Name horder is " + name );
      System.out.println("numder card is " + cardNo );
      System.out.println("the balance is " + balance);
      System.out.println("the pay limit is " + pLimit);
      System.out.println("the interest Rate is " + interestRate);


}




public class Mainnn{
public static void main(String [] args ){



CreditCardAcc card1 = new CreditCardAcc();

card1.setCreditCardAcc("Ahmed" + "1011" + 46 + 234 + 324);

card1.printInfo();


card1.purchase(50);
card1.pay(20);
card1.applyInterest();


card1.printInfo();


}
}