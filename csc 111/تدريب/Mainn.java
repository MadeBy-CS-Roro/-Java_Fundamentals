class Massege {

   private User sender,reciver ;
   private String text;


   public Massege (User sender , User reciver , String text ) {
   
      this.sender = sender;
      this.reciver= reciver;
      this.text = text;
   
   }


   public String getText(){
      
      return text;
   }

}



class User {

   private String name;
   private int totalSent, totalRecieved;
   private Massege lastMassege;

   public User(String name) {
      
      this.name= name;
      totalSent = 0;
      totalRecieved = 0;
      lastMassege = null;
   }


//methoed

   public void addSent() {
         
      totalSent++;
      System.out.println(" tehre is an added messega");
   }


   public void addRecive() {
   
      totalRecieved++;
      System.out.println(" there is a recived messega");
      
   
   }


   public void setLastMassege(Massege msg) {
   
      lastMassege = msg ;
   }
   
   public void getLastMassege () 
  
   public void display() {
    
      System.out.println("user name " + name);
      System.out.println("user total sent" + totalSent);
      System.out.println("user total recive " + totalRecieved);
      System.out.println("user,s last massege " + lastMassege.getTaxt());
   
   
    
    
   }
  
    
    
    
    
   
    
    
}



public class Mainn{
   public static void main( String [] args ){
      
      User user1 = new User("Ahmed");
      User user2 = new User("Mohamad");
   
   
      Massege m1 = new Massege ( user1, user2, "hi" );
      user1.setMassege(msg1);
      user2.setMassege(msg1);
      user1.addSent();
      user2.addRecieved();
   
      user1.display();
      user2.display();
   
   
   
   }

}