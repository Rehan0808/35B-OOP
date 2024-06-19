
public class ConstructorClass{

    public static void main(String[] args) {

        ConstructorExample ce = new ConstructorExample();
        System.out.println("After object");
        ParamConstructor pc = new ParamConstructor(10 , 20);
        System.out.println(pc.data2);

        Cat cat = new Cat("jj" , 12);
        System.out.println("Name : " + cat.getName());

        cat.setAge(cat.getAge()+1);
       
        System.out.println("Age " + cat.getAge() );

        cat.breed = "xyz" ;
        System.out.println("Breed :" + cat.breed );

        cat.color = " orange" ;
        System.out.println("Color : " + cat.color);


    }

}

// Task 
// Make a class Cat 
// Makw 2 private attributes name , age 9
// Make 2 public attributes breed , color
//Make a aconstructor to only set name and age 
// Make a setter for age 
// Make an object of cat 
// Fill the attributes 
// Add + 1 to the correct age 
// Print the following using object 
// Name : jj
// Age : 4 
//Breed : XYZ
// color : orange 

class Cat {
    private String name ;
    private int age ;
    public String breed ;
    public String color ;

    public  Cat(String name , int age ){
        this.name = name ;
        this.age = age ;

    }

    public void setAge(int age){
        this.age=age ;
    }

    public int getAge(){
        return age ; 
    }

    public String getName(){
        return name ;
    }

}

class ParamConstructor{
    private int data1  ; 
    public int data2 ; 

    void setData (int data1 ){
        this.data1 = data1 ;
    }
    ParamConstructor (int d1 , int d2 ){
        data1 = d1 ; 
        data2 = d2 ;
    }
}

class ConstructorExample{
    // Non parametarized constructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        // Add more logic
        // Only called once, to set attributes value in most cases
    }
}