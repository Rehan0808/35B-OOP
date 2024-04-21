public class Primitive {

    /* Instance variable
     * Access with object
     * Is not shared with othr object
     */

     int instanceVariable = 120;
     /*Static variable
      * Access with Class
      * Is shared with other object
      */
     static int staticVariable=2000;

    public static void main(String[] args) {

        /* None primitive data type declaration */
        byte bytevalue;

        /*Initialization */
        bytevalue=10;

        /* Declaration and initialization */
        short shortvalue=100;

        /*Multiplle declaration */
        int intvalue1, intvalue2;

        /*multiple initialization */
        intvalue1=-99; intvalue2=99;

        /*Multiple DEclaration and initialization */
        long longvalue1= -999,longvalue2=999;

        float floatvalue=1.90f; // the letter f is required

        double doublevalue=28.88d; //the letter "d " ia optional

        char charvalue='C';// single letter in single quote 

        boolean booleanvalue = false; //true/false or lowercase

        /* None primitive Data type */
        /*string */
        String stringInfo1 = "This is variable" ;
        /* Using Class */
        String stringInfo2 = new String("Class");
        /*Object use the same class as written above */
        Primitive variableObj = new Primitive(); // class ko name + variableobj

        /* illegal  action  */
        /*byte bytevalue= 10;// You cannot redclare */
        /*byteValue =20 ; //instead reassign */
         /*boolean boolVal3 = 'false';// wrong data type
         *short shortVal = 10000000;// cannot exceed min/max
         */
         
/*We need to use object to acccess instance variable */
System.out.println(variableObj.instanceVariable);
/*We can access the static variable with class */
System.out.println(Primitive.staticVariable);


        /* Type casting */
        /* Implicit type casting 
         * From smaller type is larger type
         */
        int intValueConvert = 10;
        double doubleValueConvert = 19.23d;
        int doubleValueConvertedToInt = (int) doublevalue;
    }
    
}
