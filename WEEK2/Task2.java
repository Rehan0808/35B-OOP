import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        
        /* Write a program to calculate SI. 

Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

Scanner sc =new Scanner(System.in);

System.out.println("Enter the amount  : ");
Float amount = sc.nextFloat();

System.out.println("Enter the time  :");
float time = sc.nextFloat();

System.out.println("Enter the rate : ");
float rate = sc.nextFloat();

Float SI = amount * time * rate/ 100 ;

System.out.println("The SI is : $"  + SI) ;
sc.close();
    }
    
}
