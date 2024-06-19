public class Task4 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rehan", "Software developer", 65000);
        System.out.println("Initial value");
        System.out.println(e1.getName() + " " + e1.getJobtitle() + " " + e1.getSalary() );

        //Updating values

        System.out.println("Updating Value");
        e1.setName("JOHN");
        e1.setJob("DEVELOPER");
        e1.updateSalary(15000);
        System.out.println(e1.getName() + " " +  e1.getJobtitle() + " "  + e1.getSalary() );

        Employee e2 = new Employee("Pandu", "frontend", 20000);
        System.out.println("Initial value : ");
        System.out.println(e2.getName()  + " " + e2.getJobtitle()  + " " +  e2.getSalary() );


        // Updating value
        System.out.println("Updating value ");
        e2.setName("JOHNny");
        e2.setJob("tester");
        e2.updateSalary(15000);
        System.out.println(e2.getName() + " " + e2.getJobtitle() + " " + e2.getSalary() );

       
       
       
       
       

        
    }
    
}
/*4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary. */

class Employee {
    private String name ;
    private  String jobtitle;
    private long salary ;
    

    public void setName(String name){
        this.name = name ;
    }

    public String getName(){
        return name ;
    }

    public void setJob(String jobtitle){
        this.jobtitle =jobtitle ;
    }

    public String getJobtitle(){
        return jobtitle ;
    }

    public void setSalary(long salary){
        this.salary = salary ;
    }

    public long getSalary(){
        return salary ;
    }

   
    // constructor banau da return type hudainw 
    public Employee (String name , String jobtitle , long salary ){
        this.name = name ;
        this.jobtitle =jobtitle ;
        this.salary = salary ;
    }

    // method banau da return type lekhney 

    public void updateSalary(long amount){
        this.salary +=amount;

    }


}
