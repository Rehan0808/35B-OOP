package WEEK4;
public class JumpStatement {
    public static void main(String[] args) {
        /* break and continue are jump statement */
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break; // this will end the loop from here
            }
            System.out.println("Index" + i);
        }// break will exit scope here

        /* CAn be used in while/do while */
        int counter = 0;
        while (counter < 3) {
            if(counter == 1){
                break; //exit from here
            }
            System.out.println("While Counter" + counter);
            counter ++;
        }

        /* continue will skip the current iteration
         * or will bypass all the statement below it */
        for (int index = 0; index < args.length; index++) {
            if (index == 2) {
                continue; // when called, it will bypass everything below
            }
            System.out.println("Continue Index" + index);
           
        // /* Break on a nested loop */
        // for (int outer = 0; outer < args.length; outer++) {
        //     for (int inner = 0; inner < args.length; inner++) {
        //         if (inner == 2) {
        //             break; // this will only exit the inner for loop
        //         }
        //         System.out.println("Inner Index " + inner);
        //     }// break will exit this scope if used in inner
        //     System.out.println("Outer Index" + outer);
        // }
        // System.out.println("Labeled Break");
        // /* Labeled Break */
        // outerLoop: for(int outer = 0; outer < 2; outer ++){
        //     innerLoop: for (int inner = 0; inner < args.length; inner++) {
        //         if (inner == 2) {
        //             break outerLoop;
        //         }
        //         System.out.println("Inner Index" + inner);
        //     }
        //     System.out.print("Outer Index" + outer);
        // }


        /* Task
         * loop from -5 to 5
         * break the loop if the value is positive */
        for (int i = -5; i <= 5; i++) {
            if (i > 0) {
                break;
            }
            System.out.println(i);
        }

         /* Task 
          * loop from 1 - 20
          * Print the number only if even
          use continue to complete
          */
          for (int j = 1; j <=20; j++) {
            if (j%2 != 0) {
                continue;
            }System.out.println("Even number" + j);
          }
        }
    }
}
