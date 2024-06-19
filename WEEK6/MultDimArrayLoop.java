// package WEEK6;

// public class MultDimArrayLoop {

//     public static void main(String[] args) {
        
//         int [] [] twoArray= new int[2][3];
//         twoArray [0][0] = 10;
//         twoArray [0][1] = 20;
//         twoArray [0][2] = 30;
//         twoArray [1][0] = -30;
//         twoArray [1][1] = -20;
//         twoArray [1][2] = -10;


//     /* Visual 
//      * {
//      * [10 , 20 , 3],------->0
//      * [-30 , -20,  -10]---->1
//      * }
//      */
    
//      //LooP multi dimensioanla array with nested loop 
//      //outer selects the array , inner slects  the actual value inside

//         int outerLength = twoArray.length;
//         for (int outer = 0; outer < outerLength; outer++) {
//             // twoArray[outer] -> iterate each array
//             int innerLength = twoArray[outer].length;
//             for (int inner = 0; inner < innerLength; inner++) {
//                 System.out.println(twoArray[outer][inner]);
//             }
//         }
//     }

//     /* Task 
//      * Make the following array name 
//      * {
//      * ["Sarjak", "Ayush" , "Rabi"],
//      * ["Yudip", "Utsav" , "Bibek"],
//      * ["Rehan", "Kimti" , "Sneha"],
//      * }
//      * 
//      * Print all the names 
//      * Also , find on which array is kimti is output 2;
//      */





package WEEK6;

public class MultDimArrayLoop {

    public static void main(String[] args) {
        
        // Initialize and populate the twoArray
        int[][] twoArray = new int[2][3];
        twoArray[0][0] = 10;
        twoArray[0][1] = 20;
        twoArray[0][2] = 30;
        twoArray[1][0] = -30;
        twoArray[1][1] = -20;
        twoArray[1][2] = -10;

        /* Visual 
         * {
         * [10 , 20 , 30],------->0
         * [-30 , -20,  -10]---->1
         * }
         */
    
        // Loop through multi-dimensional array with nested loop
        int outerLength = twoArray.length;
        for (int outer = 0; outer < outerLength; outer++) {
            // twoArray[outer] -> iterate each array
            int innerLength = twoArray[outer].length;
            for (int inner = 0; inner < innerLength; inner++) {
                System.out.println(twoArray[outer][inner]);
            }
        }

        // Task: Initialize and print names array, and find "Kimti"
        String[][] names = {

            // ya 3ta outer array xa 

            // 1
            {"Sarjak", "Ayush", "Rabi"}, 

            //2
            {"Yudip", "Utsav", "Bibek"},

            //3 
            {"Rehan", "Kimti", "Sneha"} // each ouyer array bhitra 3 ta inner array xa i.e names haru 
        };

        int namesLength = names.length; //kati ota row xa vanerw thapaunw use garinxa 
        for (int outer = 0; outer < namesLength; outer++) {
            // names[outer] -> iterate each array
            int innerLength = names[outer].length; // Purpose: The purpose of this line is to determine how many elements are in the inner array at the current outer index

            /* names[outer] :This expression accesses the inner array() i.e row bhitra ko elements )at the index specified by the variable outer within the 2D array names. */

            /*.length: This property gets the length of the specified inner array. For example, if outer is 0, names[0] would be {"Sarjak", "Ayush", "Rabi"}, and names[0].length would be 3. */
            


            for (int inner = 0; inner < innerLength; inner++) {
                System.out.println(names[outer][inner]); // This prints the current element of the sub-array (names[outer][inner]). row 0, 1 ,2 ma vaye ko elements lai print garxa 

                if (names[outer][inner].equals("Kimti")) {
                    System.out.println("Kimti is in array: " + outer);
                }
            }
        }
    }
}



