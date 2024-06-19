//2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.


public class Task2{
    public static void main(String[] args) {
        
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(10);
        si.setTime(5);
        si.setRate(7.2f);

        System.out.println("The Simple Interest is : " + si.calculateSi());

    

    }
}

class SimpleInterest {
    private int  principle ;
    private int time ;
    private  float  rate ; 

    public void setPrinciple(int principle ){
        this.principle =principle ;

    }

    public int getPrinciple(){
        return principle ;

    }

    public void setTime(int time ){
        this.time =time ;

    }

    public int getTime(){
        return time ;
        
    }

    public void setRate(float rate ){
        this.rate =rate ;

    }

    public float getRate(){
        return rate ;
        
    }

    public float calculateSi(){

        return (float) (principle * time * rate ) /100 ;

    }

}
