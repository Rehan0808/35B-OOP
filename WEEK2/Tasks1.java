import java.util.Scanner;

public class Tasks1 {

    public static void main(String[] args) {
        
        /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */


        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER your name : ");

        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age  > 18){
            System.out.println(name + " You are eligible to vote ");
        }
        else{

            System.out.println(name + " Sorry you are not eligible to vote ");


    }
    sc.close();
}
}
