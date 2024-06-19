package WEEK10;

public class AbstractClass {
    public static void main(String[] args) {

    }
    
}

// To make abstract clas keyword "abstract " before "class"
// If you make abstract class , cannot make object of it 

abstract class SmartPhone{

    //abstract class may or may not contain abstract functions
    // to make abstract function use " abstract" before  making funnction 
    // abstract class do not have a body 

    abstract void sms();
    abstract public boolean call(String number);

    //abstract class can have normal functions

    void imei(){
        System.out.println("Imei number ");
    }
}

// Abstract class can only be used in sub/child class
class Samsung extends SmartPhone {
    //When extending abstract class we have  to implement / override
    //alll the abstract function of abstract class 

    @Override
    void sms(){
        System.out.println("Samsung way of sending sms ");
    }

    @Override
    public boolean call(String number){
        System.out.println("Samsung calling to " + number );
        return true ;
    }
}
//Make a class Apple extending Smartphone 
//Make object of Samsung and Apple, 
// call sms() and call() function of them 
