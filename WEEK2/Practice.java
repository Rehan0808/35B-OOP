import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        
    Scanner sc  =new Scanner(System.in);

    System.out.println("Enter a number :");

   int num = sc.nextInt();

  

   if (num >= 18) {
    System.out.println("The number " + num  + " is greater THAN 18 ");
   }

    else if (num < 0 ){
        System.out.println("please input positive number");
    
    }

    else {
        System.out.println("the number is smaller than 18 ");
    } 
   }

  

    }
    
