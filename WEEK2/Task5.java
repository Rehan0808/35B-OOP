import java.util.Scanner;

public class Task5 {

    // Write the ternary operator for question no. 1

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age  : ");

        int age = sc.nextInt();

        //  condition ? expression1 : expression2. 

        // ternary operator is the shorthand of if-else.

        String checking = (age>=18) ?  "Yes you can vote" :  " You cannot vote " ; 

        System.out.println(checking);
        sc.close();
    }
    
}
