public class PrefixPostif {
    public static void main(String[] args) {
        int prefixValue = 10;
        System.out.println("Prefix will update here" + ++prefixValue);
        System.out.println("It will remain the same" + prefixValue);
        /*Prefix is usded when you put operator im the left side of value/var  */

        int postfixValue = 20;
        System.out.println("Prefix willl not update here" + postfixValue++);
        System.out.println("It will update here" + postfixValue);
        /* POSTFIX is when you put opwerator in the right size */
    }
    
}
