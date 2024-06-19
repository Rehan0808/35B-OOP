package WEEK9 ;
public class InheretanceClass {

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.firstName = "XYZ" ;
        cc.lastName= "Pradhan" ;
     
        cc.expenses = 100.11 ;


        // private child le chalau nw paudainw 
        // cc.salary = 10000; 

        cc.info();
        cc.detail();

        GrandChild gc = new GrandChild();
        gc.middleName = "GGGG" ;
        gc.description();

        
    }
}
    class ParentClass{
        public String lastName ;
        private int salary ;
        protected double expenses ;
        void info(){
            System.out.println("Parent Function : " + lastName );
        }
    }


    // to use inheritence use trhe keyword "extends"
    // single level inheritance , one eparent/super - one child/sub
    class ChildClass extends ParentClass {
        String firstName ;
        void detail(){
            System.out.println(firstName + " " + lastName);
        }

    }

    // Multi level inheritance , nested class, child class has another child Class 
    class GrandChild extends ChildClass {
        String middleName ;
        void description(){
            System.out.println(firstName + " " + middleName + " " + lastName ) ;
        }

    }


    class BrotherClass extends ParentClass {
        String address ;
        void living(){
            System.out.println(lastName + " " + address );
        }
    }

     
