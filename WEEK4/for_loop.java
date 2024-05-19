package WEEK4;
public class for_loop {
    public static void main(String[] args) {
        
        /* for loop takes iniialization
         * condition
         * modify/update */
        
         for(int index = 0 ; index <=5; index ++){
            System.out.println("for index" + index);
         }
   /* can use different update logic like
          * for (int index = 0; index<= 5 ; index += 3) */
        /* Using decrement */
        for (int index = 10; index >= 0 ; index--) {
            System.out.println("For Index Decrement" + index);

    }
    /* TASK
     * Make a multiplication table of 2 
     * for eg:
     * 2 x 1 = 2
     * 2 x 2 4 
     * .....
     * Note : loop from 1 to 10 and multiply the index
     */

       for (int i = 1; i <=10; i++) {
        System.out.println("2 x" + i + "=" + (2*i)); 
 }
 /* Nested for Loop 
  * Using for loop inside the scope of fro loop
  */
  for(int outer = 0; outer < 2 ; outer ++){
    for(int inner = 0; inner > 0 ; inner--){
        System.out.println("Inner index" + inner );
    }
    System.out.println("Outer Index" + outer);
  }

  /* TASK
   * Make a multiplication table like the following 
   * Multiplication table of 10
   * 10 x 1 =10
   * 10 x 2 = 20
   * ....
   * 
   * Multiplication table of 1 
   * 1 x 1=1
   * 1 x 2 = 2
   * ...
   * 1 x 10 =10
   */         

   for (int ii = 10; ii >=1; ii--) {
    System.out.println("Multiplication table of " + ii);
    for (int jj = 1; jj <= 10; jj++) {
        System.out.println(ii + "x" + jj + "=" + (ii*jj));
}
}
}
}