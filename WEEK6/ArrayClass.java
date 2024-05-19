package WEEK6;

public class ArrayClass {

    public static void main(String[] args) {

        /* Array Declaration */

        int[] myFirstArray;

        /* Memory allocation */

        myFirstArray = new int[5];

        /* Array declaration and memory alllocation  */
        int[] mySecondArray = new int[3];

        /* Array declaration , memory alloc, and initialization  */
        int[] myThirdArray = {10, 20, 30 , 40};


        //Array Index ----> Position of element/values
        //starts with zero

        mySecondArray [0]=10; 
        mySecondArray [1]=20; 
        mySecondArray [2]=100; 

        //Access / store in  new variable 

        // int arrayElement = mySecondArray[0]; // variable ma ni value store garnw milxa

        System.out.println("First index"  +  mySecondArray [0]);
        System.out.println("Second index" + mySecondArray[1]);

        /* TASK 1
         * Make the folowing array named animals
         * ["cat" , "dog" , "tiger" , sanke]
         * print "snake"
         */


         String[]  animals = {"CAT" , "DOG" , "TIGER" , "SNAKE"};
         System.out.println(animals[3]); 





        

    }
    
}
