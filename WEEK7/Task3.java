
public class Task3 {
    /*3. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

 */

 public static void main(String[] args) {
    
    Dog d1 = new Dog("Tommy", "Husky");

     // modifying attribute 
     d1.setName("hummer");
     d1.setBreed("germanshepard");
     System.out.println("the name of first dog is : " + d1.getName() + " and the Breed is " + d1.getBreed() );


     Dog d2 = new Dog("hero " , "husky");

     d2.setName("JACK");
     d2.setBreed("Puggy");
     System.out.println("the name of second dog is : " + d1.getName() + " and the Breed is " + d1.getBreed() );


 }
}

class Dog {
    private String name;
    private String breed ;

    public void setName(String name){
        this.name =name ;
    }

    public String getName(){
        return name ;
    }
    public void setBreed(String breed){
        this.breed = breed ;
    }
    public String getBreed(){
        return breed ;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
}

