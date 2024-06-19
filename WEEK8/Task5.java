/*5. You are designing a car rental system, and you need to create a Car class. The Car class should have private instance variables for the car's make, model, and rental price per day. Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once during object creation. Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, updating its availability status. */



class Car {
    private String make ;
    private int model ;
    private int pricePerDay ;
    private boolean isAvailable ;

    public Car(String make , int model , int pricePerDay ){
        this.make =make ;
        this.model= model ;
        this.pricePerDay = pricePerDay ;
        this.isAvailable = true ;
    }


    public void setMake(String make){
        this.make =make ;
    }
    public String getMake(){
        return make ;
    }

    public void setModel(int model){
        this.model =model ;
    }
    public int getModel(){
        return model ;
    }

    public void setPricePerDay(int pricePerDay){
        this.pricePerDay =pricePerDay ;
    }
    public int getPricePerDay(){
        return pricePerDay ;
    }

    public boolean isAvailable(){
        return isAvailable ;
    }

  public void rentCar(){

    if (isAvailable) {

        isAvailable =false ;
        System.out.println("The car is not available at this time ");
    }
    else {
        System.out.println(" Sorry ! The car is already benen taken ");
    }

  }

  public void returnCar(){
    if (!isAvailable) {
        isAvailable = true ;
        System.out.println("The car has been returned Thank You !!!!! ");
        
    }

    else{
        System.out.println("The car has already been returned ");
    }
        
  }


}

public class Task5{
    public static void main(String[] args) {
        
        Car c1 = new Car("Toyota", 2023, 50); 

      
        c1.setMake("Honda");
        c1.setModel(2022);

        c1.rentCar();
        c1.returnCar();

  
        System.out.println("Make: " + c1.getMake());
        System.out.println("Model: " + c1.getModel());
        System.out.println("Price Per Day: $" + c1.getPricePerDay());
        System.out.println("Is Available: " + c1.isAvailable());
    }
}