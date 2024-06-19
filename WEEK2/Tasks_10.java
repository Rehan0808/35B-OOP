import java.util.Scanner;

public class Tasks_10 {

    /*
     * 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
     And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator
     */

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of physic : ");
        double phy = sc.nextDouble();

        System.out.println("Enter the marks of chemistry : ");
        double chem = sc.nextDouble();

        System.out.println("ENTER THE marks of math  :");
        double math = sc.nextDouble();

        System.out.println("Enter the marks of Nepali : ");
        double Nepali = sc.nextDouble();

        double totalMarksObtain = phy + chem + math + Nepali ;

        double fullMarks = 100;
        double totalMaxMarks = fullMarks * 4;

        double percentage =( totalMarksObtain / totalMaxMarks ) * 100 ;

        

        String division;
        if (percentage >= 70) {
            division = "First Class";
        } else if (percentage > 59) {
            division = "Upper Second Class";
        } else if (percentage > 49) {
            division = "Second Class";
        } else if (percentage > 39) {
            division = "Third Class";
        } else {
            division = "Fail";
        }

        System.out.println("Total marks obtained  :" + totalMarksObtain );

        System.out.println("The total percentage obtained is  " + percentage+ "%");

        System.out.println("result "  + division);
        sc.close();


     }
    
}
