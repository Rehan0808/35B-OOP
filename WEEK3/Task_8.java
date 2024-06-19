import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {
        /* Create a Java program that takes two numbers and an operator (+, -, *, /)
         as inputs and performs the corresponding arithmetic operation using a switch case statement. */

         Scanner sc = new Scanner(System.in);

         System.out.println(" enter 1st number : ");

         int a =sc.nextInt();

         System.out.println("Enter 2nd number : ");
         int b = sc.nextInt();

         System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        int result = 0 ;
         switch (operator) {
            case '+':
            result = a + b; 
                
                break;
                case '-':
            result = a - b; 
                
                break;
                case '*':
            result = a * b; 
                
                break;
                case '/':
                if (b!=0) {
                    result = a / b;
                     
                }
                else{
                    System.out.println("THe value of b cannot be zero");
                }
                sc.close();
           
           return;
        
                
         
            default:
            System.out.println("Enter a valid operator ");
                break;
         }

         System.out.println("the resu;t of " + a + "and " + b + " is " + result);
         sc.close();
    }
}
