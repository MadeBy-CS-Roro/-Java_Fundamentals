class Particle {

//
   private double x;
   private double y;
   private double distX;
   private double distY;
   public static double totalDistXAll;
   public static double totalDistYAll;
   public static double lastX;
   public static double lastY;


//

   public Particle() {
      x = 0;
      y = 0;
      distX = 0;
      distY = 0;
   
   
   }


   public Particle(double newX ,double newY){
      this.x = newX;
      this.y =newY;
      
      
   }      
   


   public double getX() {
   
      return x;
   
   }



   public double getY() {
   
      return y;
   
   }


   public  void move( double dx ,double dy){
   
      double newX = x + dx;
      double newY = x + dy;
      
    
      if ( newX ==lastX &&  newY == lastY ) {
      
         System.out.println(" the partical position : " + x + y + " can not be move to " + newX  + newY);
         return;
      }
        
      distX += Math.abs(dx);
      distY += Math.abs(dy);    
        
      x = newX;
      y = newY;
       
       
      lastX = x;
      lastY =y;
          
   
   }

   

   public static double gettotalDistXAll() {
   
      return totalDistXAll;
   
   }




   public static double gettotalDistYAll() {
   
      return totalDistYAll;
   
   
   }


   public void displayPosition(){
   
      System.out.println("the partical position : " + x + y);
   }


   public void displayInfo(){
   
      System.out.println(" X is " + x );
      System.out.println(" y is " + y );
      System.out.println(" dist X is " + distX );
      System.out.println(" dist Y is " + distY );
      System.out.println(" total Dist X All is " + totalDistXAll);
      System.out.println(" total DistY All is " + totalDistYAll);
      System.out.println(" last X is " + lastX);
      System.out.println(" last Y is " +lastY);
   
   
   }

}


public class Main4 {
   public static void main (String [] args ){
   
      Particle p1 = new Particle();
      Particle p2 = new Particle();
   
      p1.Particle(2,2);
      p1.move( 3,-2);
      p1.displayInfo();
   
      p1.move( 2,-7);
      p1.displayInfo();
   
   
      p2.Particle(0,0);
   
      p2.move(7,-7);
      p2.displayInfo();
   
   
      p2.move(2,4);
      p2.displayInfo();
   
   
      System.out.println("DISTANSCE X" + p1.getDistX());
      System.out.println("DISTANSCE Y" + p1.getDistY());
   
   
      System.out.println("DISTANSCE X" + p2.getDistX());
      System.out.println("DISTANSCE Y" + p2.getDistY());
   
   
   
      System.out.println("TOTAL DISTANSCE X" + Particle.totalDistXAll());
      System.out.println("TOTAL DISTANSCE Y" + Particle.totalDistYAll());
   
   
   }
}