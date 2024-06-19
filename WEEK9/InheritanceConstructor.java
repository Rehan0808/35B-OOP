package WEEK9;

public class InheritanceConstructor {

    public static void main(String[] args) {
        
        Polo p1 = new Polo();
        p1.differentColor("Yellow");
        Polo p2 = new Polo("Red");
        Polo p3 = new Polo(10);

        // Calll constructor with overloaded parameter 
    }
    
}

class Shirt {
    String color= "Black"; //super.color vaneko extend vako class ko color
    Shirt(){
        System.out.println("Making shirt");
    }
    Shirt (String color){
        this.color = color ;
    }
}

class Polo extends Shirt{
    String color = "White" ; //this.color
    String texture ;
    Polo(){
        // By default the constructor of parent is called
        // meaning super() or Shirt() on first line of excution 
        super("White" ) ;
        System.out.println("Making Polo Shirt ");
    }

    // Constructor Overloading
    // Same name function / Constructor with different logic/param

    Polo(String color){
        this.color = color ;
    }
    Polo (String color , String texture){
        this.color = color ;
        this.texture = texture ;
        System.out.println("Constructor with two string");
    }

    Polo(int num ){
        System.out.println(num );
        System.out.println("Constructor with one int ");
    }
    
    //NOTE that constructor oveload takes the difference in data type
    //not the variable Polo(String c) cannot be made 

    void differentColor(String color){
        System.out.println("Param color" + color );
        System.out.println("Class color " + this.color);
        System.out.println("Parent color " + super.color);

    }
}

