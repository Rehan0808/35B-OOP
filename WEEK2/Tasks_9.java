import java.util.Scanner;

public class Tasks_9 {

    /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");

        double length = sc.nextDouble();

        System.out.println("Enter the breadth  :");
        double breadth = sc.nextDouble(); 

        double area = length * breadth; 

        int areas = (int) area; 

        System.out.println("THE AREA OF RECTANGEL IS : " + areas);
        sc.close();

    }
    
}
