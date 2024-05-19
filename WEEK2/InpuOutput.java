import java.util.Scanner;
/*or use
import java.util.*;// imports
 */
public class InpuOutput {
    public static void main(String[] args) {
        /*User Output 
         * System.out.printin("Print next line "):
         * "sout" for shortcut
        */
        System.out.println("This string breaks Line");
        /*System.output.print
         */
        System.out.print("This will not braek line");
        System.out.print("This will continue");
        /*System.out.printf
         * String Formatter
         * %s String, %d integer , %f floating point,%b boolean
         */
        System.out.printf("Hello %s,Nice", "world");
        System.out.printf("This is num %d",10);
        /*You can use multiple formatter  */
        System.out.printf("Num %f and bool %b",10.3f,false);

        /* User Input */
        Scanner scan = new Scanner(System.in);
        System.out.println("The folloeing takes whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println("The input is" + wholeWString);

        System.out.println("The following takes integer");
        int intInput= scan.nextInt();
        System.out.println("This input is "+ intInput);

        System.out.println("The following takes double");
        double doubleInput= scan.nextDouble();
        System.out.println("This input is " + doubleInput);
        
        System.out.println("The follwing take boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is" + booleanInput);
        scan.close(); // close after taking all the input.
        


    }
    
}
