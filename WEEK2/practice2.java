import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number :");

        int num = number.nextInt();

        //the variable msg is declared as a String. This is because the values being assigned to msg are string literals ("The number is Greater" and "The number is Smaller").
        String msg = (num >= 18) ? "The number is Greater" : " The number is Smaller"; // if else ko shorthend 
        System.out.println(msg);
   
    }
}
