class Truck {

   private String model;
   private int year;
   private double loadCapacity;
   private double askingPrice;
   private double bestOffer;


   public Truck () {
      
      model = null;
      year = 0;
      loadCapacity = 0;
      askingPrice = 0;
      bestOffer = 0;
      
   
   }

   public void setTruck ( String model , int year ,double loadCapacity , double bestOffer , double askingPrice ) {
      this.model = model ;
      this.year = year;
      this.loadCapacity = loadCapacity;
      this.bestOffer = bestOffer;
      this.askingPrice = askingPrice;
   
   }
  
 
   public String getModel() {
   
      return model;
   
   }

 
   public int getYear() {
   
      return year;
   
   }





   public double getLoadCapacity() {
   
      return loadCapacity;
   
   }


   public double getAskingPrice() {
   
      return askingPrice;
   
   }



   public double getBestOffere() {
   
      return bestOffer;
   
   }
 
   public void setBestOffere ( double newOffer) {
   
      bestOffer = newOffer;
   
   }

   public boolean comparble(Truck t) {
   
   
      if (this.model.equals(t.model) && this.year==t.year &&  Math.abs( this.loadCapacity - t.loadCapacity) <= 500)
         return true;
      
      else
         return false;
   
   }
 
   public double priceGap() {
   
      return askingPrice - bestOffer;
      
          
   
   }
 
 
 
   public void printTruck(){
   
      System.out.println(" the modal is " + model);
      System.out.println(" the year is " + year);
      System.out.println(" the load Capactiy is " + loadCapacity);
      System.out.println(" the askingPrice is " + askingPrice);
      System.out.println(" the besrOffer is " + bestOffer);
   
   
   }

}


public class Mainnnn {
   public static void main(String [] args ){
   
   
      Truck t1 = new Truck();
      Truck t2 = new Truck();
   
   
      t1.setTruck("Volve" , 2017, 12000, 60000, 55000);
      t2.setTruck("Volve" , 2017, 12450, 62000, 59000);
   
   
      t1.printTruck();
      t2.printTruck();
   
      System.out.println(" are trucks comparable ?" + t1.comparble(t2));
   
      t1.setBestOffere(13400);
   
      t1.printTruck();
   
   
   }

}