package WEEK4;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        
        /* Check the same condition in while and do while for difference */
        int counter = 0;
        while(counter < 0){
            System.out.println("The condition is false , it won't run");
        }
        
        // do {
        //     System.out.println("This run first  then checks the condition");
        // } while (counter < 0);
        /* Dow while run at least once, even if the condition is false */

        /* Task
         * Prompt user to enter a number
         * run loop and ask user the integer until the
         * integer is neagtive
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter a number:");
         int inputInt = scan.nextInt();

         while (inputInt > 0 ) {
           System.out.println("Integer should be negative");
           inputInt = scan.nextInt();
         }
         System.out.println("Condition Matched negative integer : " + inputInt);
         scan.close();
    }
}         