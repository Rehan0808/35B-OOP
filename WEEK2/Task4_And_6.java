import java.util.Scanner;

public class Task4_And_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numebr : ");

        int a  = sc.nextInt();
        
        System.out.println("Enter another number  : ");
        int b  =sc.nextInt();

        int sum = a + b ;

        int product = a * b ; 

        float division = sum / product ; 

        

        System.out.println("The sum is : " + sum);
        System.out.println("THE product is : " + product);
        System.out.println("The division o fgiven number is : " + division );
        sc.close();
    }


    
}
