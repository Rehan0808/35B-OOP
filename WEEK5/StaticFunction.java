package WEEK5;

public class StaticFunction {
    public static int multiply(int a, int b){
        int multiplication = a * b;
        return multiplication;
    }

    public static String vendingMachine(int menu){
        if (menu == 1) {
            return "Coke";
        }
        if(menu == 1){
            return "Water";
        }
        if (menu == 3) {
            return "Frooti";
        }
        return "Invalid Menu";
    }

    /* Task 1
     * create a function checkEligible
     * takes 2 parameter, String name, int age
     * returns String
     * if age is less than 0, more than 200 return "Hello name, Invalid age"
     * if age is less than 18 return "Sorry name, You are not eligible"
     * else return "Congralution name, You are eligible"
     */
    public static String checkEligible(String name, int age){
        if (age<0 || age>200) {
            System.out.println("Hello" + name + ", " + "Invalid age");
        }
        if (age<18) {
            System.out.println("Sorry" + name + "," + "You are not eligible");
        }else{
            System.out.println("Congralution" + name + "," + "You are eligible"); 
        }
        return "Invalid Age";
        
    }
    public static void main(String[] args) {
        /* If the function is static and in same class
         * no need to make object simply call */
        int multiplyReturn = multiply(10, 2);
        System.out.println("Result is " + multiplyReturn);

        String iGet = vendingMachine(1);
        System.out.println("I get" + iGet);

        String result = checkEligible("rehan",20);
        // System.out.println("Congralution" + name + "," + "You are eligible");
    }
}
