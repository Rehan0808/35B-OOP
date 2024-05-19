import java.util.Scanner;

public class Perimeter {


    
 /* Task 3pract
  * Write a program to print the area and perimeter of ractangle
  area = length * breadth
  perimeter = 2 (length = breadth)
  */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length :");
        float length = sc.nextFloat();

        System.out.println("Enter the Breadth :");
        float breadth = sc.nextFloat();

       float area =  length * breadth;
        System.out.println("Area of rectangle : " + area);

        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle " + perimeter);


    }
    
}
