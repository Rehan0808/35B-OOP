public class ExampleOfEncapsu {

    public static void main(String[] args) {

        Person p1 = new Person("Rehan", 19);
        
        // Original  data 
        System.out.println("Original data ");
        p1.displayInfo();

        //Updated Data :

        System.out.println("Updated Data ");

        p1.setName("Mxawell");
        // System.out.println("Name : " + p1.getName() );

        p1.setAge((35));
    //    System.out.println("Age : " + p1.getAge());
       p1.displayInfo();
        
    }
    
}

class Person {

    // Data Fields 
    private String name ;
    private int age ;

    public void setName(String name){

        // Encpsulation use garda hamiley more command haru add garnw pauxum

        if (name != null && !name.isEmpty()) {
            this.name=name ;
            
        }
        else{
            System.out.println("INvalid name ");
        }

    }

    public String getName(){
        return name ;
    }

    public void setAge(int age){
        if (age >1 && age<100) {
           this.age=age ;
            
        }
        else{
            System.out.println("INvalid age ");
        }
    }

    public int getAge(){
        return age; 
    }

    // Parametarized Constructor

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }



    // Methods 
    public void displayInfo(){
        System.out.println("Name : " + name );
        System.out.println("Age : " + age );
    }
   
}