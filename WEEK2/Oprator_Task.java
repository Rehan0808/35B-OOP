/*Task 1
 * Write a program to print weather a variable is greater or equal to 18
*/

/* Task 2
 * Write a program to print simple interest from variables
 * Make 3 variable for amount, time and  rate and save the calculation into
 * Formula: si=amount * time * rate/100; // use float/double
 */

 /* Task 3pract
  * Write a program to print the area and perimeter of ractangle
  area = length * breadth
  perimeter = 2 (length = breadth)
  */

  /* Task 4
   * Complete  the task 1 using ternary operator
   */




public class Oprator_Task {
    public static void main(String[] args) {
        int rNum1=20 , rNum2 =21;
        System.out.println("Greater than equal to "  + (rNum1>=rNum2)); // (rNum1>=rNum) yesle chai boolean value generate garxa 2 ta variable lai compare gareko xa

        /* question 2 */
        int amount=100 , time= 2 , rate= 10;
        float si= amount*time*rate / 100 ;
        System.out.println("Simple interest " + si);


        int length=10;
        int breadth=15;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle " + area);
        System.out.println("Perimeter of rectangle " + perimeter);
    }
}


