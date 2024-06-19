public class Task_1 {

    //1. Write a JAVA program to find the maximum between three numbers.

    public static void main(String[] args) {
        
        int a = 32 , b =45 ,  c =25 ;

        if(a>b && a>c ){
            System.out.println(a+ " is maximum between 3 numbers ");

        }
        else if (b>a && b>c){
            System.out.println(b + " is maximum between 3 numbers ");
        }
        else{
            System.out.println(c + " is maximum between 3 numbers");
        }
    }
    
}
