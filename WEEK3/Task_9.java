import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        /* Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number for month   :");
        int number  = sc.nextInt();
        
        // java ma cases lai eautai line ma lekhnw paidainw 

        switch (number) {
            case 1  :
            case 2 :
            case 3 :
            System.out.println("The season for the month is Winter ");
           break;

           case 4  :
           case 5 :
           case 6 :
            System.out.println("The season for the month is Spring ");
            break;
        
            case 7  :
            case 8 :
            case 9 :
            System.out.println("The season for the month is Summer");
           break;
        
           case 10  :
           case 11:
           case 12:
            System.out.println("The season for the month is Fall ");
            break;
        
        
            default:
            System.out.println("Enter a valid number of month (1-12)");
                break;
        }

        sc.close();

       
        
    }}
