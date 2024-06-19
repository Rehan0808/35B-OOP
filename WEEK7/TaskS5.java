
public class TaskS5 {

    public static void main(String[] args) {

        Cylinder cy = new Cylinder(5 , 12);

        // contruction addd garey paxi getter setter nw halda ni hunxa 

        // cy.setRadius(5.6f);
        // cy.setHeight(12);

        cy.getRadius();
        cy.getHeight();

        System.out.println("THe surface area of cylinder is : " + cy.CalculateSA());
        System.out.println("Volume of cylinder is : " + cy.VolumeOfCylinder());


        Rectangle r = new Rectangle(12 ,45);// ya value halenw vanw tala ko value print hunxa
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
       
    


       

         
    }
    
}

class Cylinder{
    private int radius ;
    private int height ;

    public void setRadius(int radius){
        this.radius = radius ;
    }
    
    public float getRadius(){
        return radius ;
    }

    public void setHeight(int height ){
        this.height = height ;

    }

    public int getHeight(){
        return height ; 
    }

    public double CalculateSA(){

        return (2 * Math.PI * radius * height + 2 * Math.PI * radius *radius );
    }

    public double VolumeOfCylinder(){
        return (Math.PI * radius * radius *height); 

    }

    public Cylinder(int radius , int height ){
        this.radius =radius ;
        this.height = height;

    }
}

class Rectangle{
    private int length; 
    private int breadth; 

    public Rectangle(){
        this.length = 4;
        this.breadth = 5 ;
    }



    public  Rectangle(int length , int breadth ){
          this.length  =length ;
          this.breadth =breadth ;
    }

    public int getLength(){
        return length ;
    }

    public int getBreadth(){
        return breadth ;
    }
    
  


}
