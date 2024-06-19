import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        
        // Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter which shape you want to calculate ");
        String area  = sc.nextLine().toLowerCase();
        double  result = 0 ;

        int res = 0 ; // rectangle lai pani double=result nai use garda ni hunxa 


        switch (area) {
            case "circle":
       

            System.out.println("Enter a radius for circle :");

            double radius = sc.nextDouble(); 

            result = Math.PI * radius *radius ;
            System.out.println("The area of circle is " + result );
             break;
        
             case "rectangle":

             // scanner mathi ekchoti use gare paxi dherai use garnu pardainw 

            //  Scanner rec = new Scanner(System.in);
 
             System.out.println("Enter a length for rectangle :");
 
             int length  = sc.nextInt();

             System.out.println("Enter breadth for rectangle :");

             int breadth = sc.nextInt();
 
             res = length * breadth  ;
             System.out.println("The area of rectangle is " + res );
              break;

              case "square":
              System.out.println("Enter a length for circle :");
  
              int side= sc.nextInt(); // yedi ya length halim vane wrong hunxa 2 choti length lekhnw mildain wmathi pani length lekheko xum
  
              res =side * side;
              System.out.println("The area of square is " + res );
               break;

               case "triangle":
       

               System.out.println("Enter a base for triangle :");
   
               double base = sc.nextDouble();

               System.out.println("Enter a height for triangle :");

               double height = sc.nextDouble();
   
               result = (0.5 * base * height) ;
               System.out.println("The area of triangle  is " + result );
                break;

            default:
            System.out.println("Enter a valid shapes : ");
                break;
        }
        sc.close();
    }
    
}
