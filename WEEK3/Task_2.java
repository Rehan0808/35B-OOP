import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        
        //2. Write a JAVA program to check whether a number is negative, positive, or zero.

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number : ");

        int num = sc.nextInt();

        if(num>=1){
            System.out.println("The number is positive ");
        }
        else if (num<0){
            System.out.println("The number is negative ");

        }
        else{
            System.out.println("The number is zero ");
        }
        sc.close();
    }
    
}
