import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        
        //3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NUMBER  : ");

       int num = sc.nextInt();

       if(num%5==0 && num % 11 == 0){
        System.out.println("The number is divisible ");

       }
       else if(num%5==0 || num%11==0){
        System.out.println("the number is only divisibly by one number");
       }

       else {
        System.out.println("THE GIVEN NUMBE RIS NOT DIVISIBLE ");
       }
       sc.close();
    }
    
}
