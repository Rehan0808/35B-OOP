package WEEK9 ;

public class Inheritance_Task {

     public static void main(String[] args) {

          Pant p1 = new Pant("Red" ,  "Gold");

        
     }
}


//Task 
// Make a class Pant 
// Add two attribute color and texture
// make a constructor or Pant that takes color and texture
// make a class halfpant that extends pant 
// make a attribute color and add default String White
// make a non param constructor of Halfpant and \ 
// call the Parametarized constructor of prent Pant with "Black " "Wool"
// Make a function design() int HalfPant that takes String color \ 
// change the parent color to current color of halfpant
// change the current color of half pant to provided parameter 

class Pant{
    String color ;
    String texture ;
    Pant(String color , String texture ){
     this.color = color ;
     this.texture = texture ;
    }

}

class HalfPant extends Pant{
     String color = "White" ;
}

