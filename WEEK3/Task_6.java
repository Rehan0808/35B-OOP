import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
         
       // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a vowel : ");

       char vowel = sc.next().charAt(0);

       vowel = Character.toLowerCase(vowel);
       
       if (vowel == 'a' || vowel == 'e' || vowel =='i' || vowel =='o' || vowel== 'u') {
        System.out.println("The given alphabet " +  vowel+ " is vowel ");
        
       }

       else {
        System.out.println( vowel +  " is not a vowel");
       }

       sc.close();
      
       
    }
    
}
