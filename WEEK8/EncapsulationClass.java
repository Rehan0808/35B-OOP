
public class EncapsulationClass{
    public static void main(String[] args) {


        
        Laptop L1 = new Laptop("Apple " , "Apple Air M1");
        L1.year = 2022 ;
        L1.setPrice(100000);
        L1.inflation(50000);
        L1.setRam(8);
        L1.setStorage(120);
        L1.upgrade(2, 128);
        System.out.println("Brand" + L1.brand);
        System.out.println("NAME"  + L1.name);



    }
}

// 1. Encapsulation enclose/bundles similar propertries/attribute
// and function/methods inside a single class

class Laptop {
    String brand ;
    String name ;

    // 2. Data hiding can be done using private modifier

    private double price;
    private int ram ;
    private int storage ;
    public int year ;

    // 3. Data attributes can have a better control using setter/getter
    // Write only using setter

    public void setPrice (double price) {
        this.price = price;

    }

    // Read only using getter 
    public double getPrice(){
      return this.price;
    }
    void branding(){
        System.out.println("Brand : " + brand );
    }
  // }

    // Task
    // Make a constructor  of laptop that takes brand and name 
    // Makr  a setter and getter  for remaining private  attributes, ram , storage 
    // Makr a functionn upgrade()takes , 2numebrs  for ram and storage \ 
    // and add to the current value of ram and storage 
    //  Make a function inflation() takes 1 number price \ 
    // and add to the current value of price
    // Make 2 object , fill the attributes and call upgrade & inflation 
    //Print the following 
    //output
    // Brand : Apple 
    // Name : Apple Air M3 
    // Price : 150000 
    // Ram : 10GB 
    // Storage : 256GB
    // Year : 2022 
    Laptop (String brand , String name){

        this.brand =brand ;
        this.name = name ; 

    }
    public void setRam (int ram){
        this.ram =ram ;
    
    }
    public void setStorage(int storage){
        this.storage = storage;

    }
    public int getRam(){
        return this.ram ;

    }
    public int getStorage(){
        return this.storage;

    }
    public void upgrade (int ram , int storage) {
        this.ram = this.ram + ram ;
        this.storage += storage ;

    }

    public void inflation (double price){

        this.price +=price ;
    }




}




