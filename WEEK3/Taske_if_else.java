public class Taske_if_else {
    public static void main(String[] args) {
        /*
         * Task
         * Consider the following marking
         * Calculate the total and avg in a variable
         * If any of the marking is less than 35, print fail
         * if avg is less than 60, print third div
         * if avg is less than 70, print second div
         * if avg is less than 80, print first div
         * if avg is equal or greater than 80, print distinction
         * if avg is less than 0 or more than 100 , print invalid
         * 
         */
        int science = 35;
        int english = 55;
        int math = 89;

        int total = science + english + math;
        int average = total / 3;

        if (science < 35 || english < 35 || math < 35) {
            System.out.println("Fail");
        } else if (average < 60) {
            System.out.println("Third Division");
        } else if (average < 70) {
            System.out.println("Second Division");
        } else if (average < 80) {
            System.out.println("Third Division");
        } else if (average < 0 || average > 100) {
            System.out.println("Distinction");
        } else {
            System.out.println("Invalid");
        }
    }

}
