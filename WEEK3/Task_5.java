import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        
        /* 5. Write a JAVA program to check whether a year is a leap year or not. 

Hint: if year%4==0; if year%100!==0 ; year%400==0;  */

// for leap year there are two condition , century and yearly
// century =(100%==0 && 400%==0)
//yearly = (100!=0 aand 4%==0)


Scanner sc = new Scanner(System.in);
System.out.println("Enter a year  :");

int year = sc.nextInt();
/* 
Leap Year Rules:
A year is a leap year if it is divisible by 4.
However, if the year is also divisible by 100, it is not a leap year unless:
The year is also divisible by 400, in which case it is a leap year.
 */

 if(year%4==0 && year%100!=0 || year%100==0 && year%400==0){
    System.out.println("The given year " + year + " is a leap year");
 }
 else {
    System.out.println("Enter a valid year ");
 }
 sc.close();
}


}

