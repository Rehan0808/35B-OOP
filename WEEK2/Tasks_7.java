import java.util.Scanner;

public class Tasks_7 {

    /*7. Take the name, roll number, and field of interest from the user and print in the format below:
    : Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your roll number : ");
        int roll = sc.nextInt(); // 
        sc.nextLine(); //scape sequence lai consume garxw // Leftover newline yo write garenw vane next user input skip hunxa
        /* after entering The input now it creates: roll\n (where \n is the newline character). 
        which doesn't stop at field because of \n as \n get stored in field 
         * nextLine() reads the remaining newline character from the buffer.
This effectively clears the buffer of the leftover newline.
        */



        System.out.println("Enter your field of Interest   : ");
        String field = sc.nextLine();
       

        System.out.println("hey , My name  is " + name + " and my roll number is " + roll + ". My field of interest are  " + field +".");

        // System.out.println("hey , My name  is " + name );
        // System.out.println("my roll number is " + roll);
        // System.out.println("My field of interest are " + field);
        sc.close();
    }
   
    
}
