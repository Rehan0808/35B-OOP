
import java.util.Scanner;

public class Task_7 {

    /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and 
    converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade A , B , C , D , F : ");

        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        double gpa = 0.0;
        switch (grade) {
            case 'A':
            gpa = 4.0;
            System.out.println("Your grdae is :  " + gpa );
                
                break;

            case 'B':{
                gpa=3.0;
                System.out.println( " Your grade is : " + gpa);
                
                break; 
            }

            case 'C':{

                gpa = 2.8;
                System.out.println( " Your grade is : " + gpa);
                break; 
            }

            case 'D':{
                gpa = 2.2 ;
                System.out.println( " Your grade is : " + gpa);
                break; 
            }

            case 'E':{
                gpa = 2.0; 
                System.out.println( " Your grade is : " + gpa);
                break; 
            }
            case 'F':{
                 
                System.out.println( " You are failed ");
                break; 
            }
        
            default:
            System.out.println("ENTER A CORRRECT GRADE ");
                break;
        }
        sc.close();
       

    }
    
}
