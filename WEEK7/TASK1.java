
public class TASK1 {
    /*1. Write a Java program to create a class called "Circle" with a radius attribute. You can access this attribute using setter and getter method. Calculate the area and circumference of the circle. */

    public static void main(String[] args) {
        Circle c1 = new Circle();
    c1.setRadius(2.0);

    System.out.println("Radius : " + c1.getRadius());

    System.out.println("Area of circle : " + c1.calculateArea());

    System.out.println("Circumference of circle : " + c1.calculateCircumference());
    }
    
}

class Circle {
    private double radius ;

    public void setRadius(double radius){
        this.radius = radius ;

    }

    public double getRadius(){
        return radius ;
    }

    // Creating Method to calculate area
    public double calculateArea(){
        return (double) (Math.PI * radius * radius);
    }

    public double calculateCircumference(){
        return (double) (2 * Math.PI * radius);
    }

    
}
