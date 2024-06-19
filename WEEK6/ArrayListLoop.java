package WEEK6;
import java.util.ArrayList ; 

public class ArrayListLoop {

    public static void main(String[] args) {
        
        /* Import ArrayList on top , import java.util.ArrayList */

        ArrayList<Integer> intArr  = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(50);

        /* To loop ArrayList , same as array , get length/size first  */
        /* To get length use.size */
        int arrLen = intArr.size();

        /* Loop from 0 to size/len -1 */
        for(int index = 0; index<arrLen; index++){
            System.out.println("Index" + index + " Value " + intArr.get(index));
    
        }

        // USing fro each 
        for (Integer element: intArr){
            System.out.println(element);
        }

        /* TASK 
         * Make an ArrayLIST as student as following 
         * ["Aruna " , "Shreeya " , "Yudip" , "Anjali" , "Nischay" , "Krishna"]
         * Maje 2 another ArrayList males and females 
         * Loop the studentSs ArrayList
         * and "Yudip", "Nischay" and "Krishna " in males 
         * and "Aruna " , "Shreeya"and " Anjali" in female
         * Print Anjali from females 
         * Print Yudip from males
         * 
         */

         ArrayList<String> students  = new ArrayList<>();
         students.add("Aruna ") ;
         students.add("Shreeya") ;
         students.add("Yudip") ;
         students.add("Anjali") ;
         students.add("Nischay") ;
         students.add("Krishna") ;
         System.out.println(students);

         ArrayList<String> male = new ArrayList<>();

         ArrayList<String> female  = new ArrayList<>();

         for(int index=0 ; index < students.size();index++){
            String value = students.get(index);
            if (value == "Aruna" || value == "Shreeya" || value == "Anjali "){

                female.add(value);

            }else{
                male.add(value);

            }
         }
         // USing foreach

        //  for (String value:students){
        //     if()
        //  }

        



    }
    
}
