import java.util.Scanner;

public class Inpot_optput_Task {
    public static void main(String[] args) {
        /*Task
         * Make a new scanner object/variable scan1
         * Prompt the folloing 
         * What is your name? --> save as string, name
         * Are you over 18? --> save as boolean,satus
         * How many siblings?---> save as int , sibling
         * Print the following
         * Hello,name
         * Over 18? status
         * You have sibling num of sibling 
         * // comment the previous scanner for ease of use 
         */
        Scanner scan1 = new Scanner(System.in);

        System.out.println("What ia your name ? ");
        String name = scan1.nextLine();
        System.out.println( "Namaste " + name);

        System.out.println("Are you over 18 ? ");
        Boolean age = scan1.nextBoolean();
        System.out.println( "Your age is " + age);


        System.out.println("How siblings you have :");
        int sibling = scan1.nextInt();
        System.out.println("You have " + sibling +  " siblings");

        scan1.close();





    }
    
}
