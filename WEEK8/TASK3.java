
public class TASK3 {

    public static void main(String[] args) {

        Student s1 = new Student("Rehan", 1010, 3.4f);

        s1.setStudentName("Pikachu");
        s1.setIDNumber(1010);
        
        System.out.println("Name : " + s1.getStudentName());
        System.out.println( " ID Number : " + s1.getIDNumber());
        System.out.println("GPA : " + s1.getGpa());
        
    }
    
}
/*3. You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. However, the GPA should be read-only and can only be set within the class constructor. */


class Student {
    //camelcase use garne 
    private String studentName;
    private int idNumber ;
    private float gpa ;

    public void setStudentName(String studentName){
        this.studentName = studentName ;
    }

    public String getStudentName(){
        return studentName ;
    }

    public void setIDNumber(int idNumber){
        this.idNumber = idNumber ;
    }
    public int getIDNumber(){
        return idNumber ;
    }

    // READONLY VANEKO XA SO GETTER MATRA GARNE CONSTRUCTOR BATW VAKUE DINE 

    public float getGpa(){
        return gpa ;
    }

    public Student(String studentName, int idNumber, float gpa) {
        this.studentName = studentName;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }


}