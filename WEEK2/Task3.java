public class Task3 {

    /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */

public static void main(String[] args) {
    

    int length = 12 ; int width = 5 ; int height = 20 ; 

    double area = 0.5 * length * width ; 
    System.out.println("The area of triangle is : " + area);

    int cube = length * length * length ; 
    System.out.println("The volume o fcube is  : " + cube);

    int cuboid = length * width * height ; 
    System.out.println("The volume of cuboid is : " + cuboid );
    
}
    
}
