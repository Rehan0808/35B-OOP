public class Operator_class {
    public static void main(String[] args) {
        /* Arithmetic Operator */
        int anum1=10, anum2=20;
        int sum= anum1+anum2;// + is an arthematic operator
        System.out.println("Addition is " + sum);
        System.out.println("Subtraction is"+ (anum1-anum2));
        System.out.println("Multiplication is" + (anum1*anum2));
        System.out.println("Diivision is " + (anum1 / anum2));
        System.out.println("Modulo is " + (anum1%anum2));
        /* Assignment operator */

        int asNum1=20; // = is used to assign value to variable
        asNum1+=1; //same as asNum1 = asNum1 +1;
        System.out.println("+= value is " + asNum1);
        System.out.println("-= value is " + (asNum1-=10));
        System.out.println("*= value is " + (asNum1*=10));
        System.out.println("/= value is " + (asNum1/=2));
        System.out.println("%= value is " +(asNum1%=3));

        /* Relational Operator */
        int rNum1=20 , rNum2 =21;
        boolean rExpression = rNum1 == rNum2; //returns true/false
        System.out.println("Equal to" + rExpression);
        System.out.println("Greater than" +(rNum1>rNum2));
        System.out.println("Less than" + (rNum1<rNum2));
        System.out.println("Not equals to " + (rNum1!=rNum2));
        System.out.println("Greater than equals to " + (rNum1>=rNum2));

        /* Logical OPERATOR */
        int lnum1=20 , lnum2= 20;
        boolean lExpression1 = lnum1==lnum2;
        boolean lExpression2 = lnum1>lnum2;
        System.out.println("&& is used for AND" + (lExpression1 && lExpression2));
        System.out.println("|| is used for OR" + (lExpression1 || lExpression2));
        System.out.println("! is used for NOT" + (!lExpression1));



        /* Unary Operator */
        int uNum1 = 10;
        uNum1++; // uNum1 = uNum1 + 1; // changes value in next line
        ++uNum1; // changes value in this same line
        System.out.println("--uNUm1 unary is " + --uNum1);
        System.out.println("uNUm1-- unary is"+uNum1--);

        /* Ternary Operato */

        int tNum1 = 20 , tNum2= 10;
        String output;
        /* take following if else as example
         * if (tNum1 > tNum2){
         * output = "True Statement";
         * }else{
         * output = "False Statement";
         * }
         */
        output = tNum1 > tNum2 ? "True Statement" : "False Statement";
        /* Here tenary operator contains expression
         * if expresiion is true it returns after the "?"
         * if the expression is false it returns after the ":"
         */
        int intOutput = tNum2 == tNum1 ? -10 : 10;
        System.out.println(output);
        System.out.println(intOutput);

        
    }
}
