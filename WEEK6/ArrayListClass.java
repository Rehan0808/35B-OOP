package WEEK6;
import java.util.ArrayList;
public class ArrayListClass{

    public static void main(String[] args) {

        /* Import ArrayList from java.utils at the top */
        /* Cannnot use primitive data type , use wrapper for it  */

        ArrayList<Integer > arrayList1 = new ArrayList<>();

        /* To add on array List  */
        arrayList1.add(10);
        arrayList1.add(20);
        System.out.println(arrayList1);

        /* Can also add at index directly  */
        arrayList1.add(1, -20 );

        /* This will shift  the currently element in 1th index to 2nd index  */
        System.out.println(arrayList1);

           /* To remove .remove(index) */
           arrayList1.remove(0); // will remove 0th index element and shift 1st to 0
           System.out.println(arrayList1);
           /* To update .set(index,value) */
           arrayList1.set(0,-200);
           System.out.println(arrayList1);
           /* To access .get(index) */
           System.out.println("0th index element " + arrayList1.get(0));


           /*TASK 
            * Make ArrayList of the following 
            ["Apple " , "Orange" , "Banana" , "Water MElone " , "Pine apple"]
            Add "Grapes " in 1 index 
            Remove Orange from teh arraylist
            remove watermwlom
            Add Pear in 0th index
            Change "Pineapple "  to "Avocado"
            Change "Apple "  to "Cherry"
            Note : Print on every add and remove to get the new index of ArrayList 
            */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Bananna");
        fruits.add("Water MELON");
        fruits.add("Pine apple ");
        // System.out.println(fruits);

        fruits.add(1 , " grapes" ) ;
        // System.out.println(fruits);

        fruits.remove(2);
        // System.out.println(fruits);

        fruits.remove(3);
        // System.out.println(fruits);

        fruits.add(0 , "Pear");
        // System.out.println(fruits);

        fruits.set(4, "Avacardo");
        // System.out.println(fruits);

        fruits.set(1, "Cherry");
        System.out.println(fruits);

   








        
    }

}