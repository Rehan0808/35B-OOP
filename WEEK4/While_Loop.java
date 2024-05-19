package WEEK4;
import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        
       int count = 0;
        while (count < 3) {
            System.out.println("While count" + count);
            ++ count;
        }
        /* When using while with variable. increment and  decrement
         * are done inside the loop */

         /* The main use of while is when you do not know how many time the loop
          * to iterate, For eg: Asking user for a number  until some condiiton
          is match, like 0-100 */

          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter a number:");
          int inputInt = scan.nextInt();

          while (inputInt < 0 || inputInt > 100) {
            System.out.println("Number between 0-100 only.");
            inputInt = scan.nextInt();
          }
        
    }
    
}
