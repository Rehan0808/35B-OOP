import java.util.Scanner;

public class Tasks_8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");

        int len = sc.nextInt();

        int area = len * len; 

        int perimeter = 4*len ; 

        System.out.println("the area of square is : " + area);
        System.out.println("the peremeter  of square is : " + perimeter);
        sc.close();

    }
    
}
