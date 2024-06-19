package WEEK4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         // 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop
    Scanner sc= new Scanner(System.in);

    System.out.println("ENTER YOUR NAME : ");

    String name = sc.nextLine();

    // i = 0-4 samma run hunxa 
    for(int i=0; i<5 ; i++ ){
        System.out.println("Hello " + name);
    }

    sc.close();
    }

   
    
    
    
}
