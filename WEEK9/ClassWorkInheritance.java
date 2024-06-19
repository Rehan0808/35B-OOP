package WEEK9;

public class ClassWorkInheritance {
   
        public static void main(String[] args) {
    
            Labrador labDog = new Labrador();
            labDog.name = "Tom";
            labDog.breed = "Labrador";
            labDog.color = "Black";
            labDog.country = "Nepal";
            labDog.speaks();
            labDog.fur();
            labDog.barks();
            labDog.play();
            
           
            GermanShepard gDog = new GermanShepard();
            gDog.name = "Yuwai Mo";
            gDog.breed = "German Shepard";
            gDog.country = "Germany";
            gDog.spot = "Main Gate";
     
            gDog.speaks();
            gDog.fur();
            gDog.barks();
            gDog.guard();

            Amphibian amp = new Amphibian();
            amp.name = "hero" ;
            amp.eggs = "five eggs" ;
            amp.scale = "have many" ;
            amp.speaks();
            amp.sheds();
            amp.swims();

            Cat cat = new Cat();
            cat.name = "Whiskers";
            cat.breed = "Siamese";
            cat.origin = "Thailand";


            cat.speaks();
            cat.fur();
            cat.meows();
    
        }
    }
    
    class Animal {
        String name;
    
        void speaks() {
            System.out.println(this.name + " Speaks");
        }
    
    }
    
    class Mammal extends Animal {
        String breed;
    
        void fur() {
            System.out.println("Fur of " + this.name + " " + this.breed);
        }
    }
    
    class Reptile extends Animal {
        String eggs;
    
        void sheds() {
            System.out.println(this.name + " sheds " + this.eggs);
        }
    }
    
    class Cat extends Mammal {
        String origin;
    
        void meows() {
            System.out.println(this.origin + " " + this.name + "Meows");
        }
    }
    
    class DogClass extends Mammal {
    
        String country;
    
        void barks() {
            System.out.println(this.name + " of " + this.country + " barks ");
        }
    
    }
    
    class Labrador extends DogClass {
        String color;
    
        void play() {
            System.out.println(this.color + " " + this.breed + " " + this.name + " of " + this.country + " Plays ");
        }
    }
    
    class GermanShepard extends DogClass {
    
        String spot;
    
        void guard() {
            System.out.println(this.breed + " guards at " + this.spot);
        }
    
    }
    
    class Amphibian extends Reptile {
        String scale;
    
        void swims() {
            System.out.println(this.name + " Swims ");
        }
    }