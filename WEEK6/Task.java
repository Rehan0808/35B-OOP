package WEEK6;

public class Task {



    /*  Make an arrya of ["John","Deo", "Bar"] 
         * Make a String "FOO"
         * Loop the array and find in which index is"Foo" on 
         * print the index
        */
        public static void main(String[] args) {

        
         String[] array = {"John"  , "Deo" , "Foo" , "Bar"};
         String target = "Foo";
         int  arrayLength = array.length;

        // for (int i=0 ; i < arrayLength ; i++){
        //     if (array[i].equals(target)) { // array bhitra ko i index ko string target sanga milxa ki nai vanerw check garxa 
        //         System.out.println("The index of Foo is " + i );
        //     }
            
        // }

      
        
                int i = 0; // Initialize loop variable
        
                // Use a while loop to iterate through the array
                while (i < arrayLength) {
                    if (array[i].equals(target)) {
                        System.out.println("The index of Foo is " + i);
                        break; // Exit the loop if the target is found
                    }
                    i++; // Increment loop variable
                }
            }
        }
        

    
    

    
