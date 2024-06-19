import java.util.Scanner;

public class Task_4 {

    // 4. Write a JAVA program to check whether a number is even or odd.

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number :");

        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println(" the number is even");

        }

        else {
            System.out.println("THE NUMBER IS ODDD");
        }

        sc.close();
    }

    
    
}
