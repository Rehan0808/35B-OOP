
package WEEK6;
public class ArrayLoop {

    public static void main(String[] args) {
        
        int[] arr = new int[4];
        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] =20;

        /* We need length of array first , use .length */
        int arrayLength = arr.length;

        /* LOOP from 0 - (arraylength -1) , 0-3 */

        for (int i = 0; i < arrayLength ; i++){
            System.out.println(arr[i]);
        }

        // or use condition , i <= arraylength -1
        System.out.println("Descending Loop");
        
        for (int i = arrayLength -1; i >= 0 ; i--){
            System.out.println(arr[i]);
        }


        //TASK 
        /* LOOP the array using while loop*/
        
        int[] arrs = new int[4];
        arrs[0] = -10;
        arrs[1] = 0;
        arrs[2] = 10;
        arrs[3] =20;

        /* We need length of array first , use .length */
        int arrsLength = arrs.length;

        int i = 0;
        while ( i < arrsLength ) {
            
            System.out.println(arrs[i]);
            i++;
        }


        
     
                    }
                }
            
        
