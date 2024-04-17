package WEEK2;

public class primitive {
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
        primitive variableObj = new primitive(); // class ko name + variableobj
        
    }
    
}
