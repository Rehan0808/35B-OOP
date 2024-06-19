
/*
 * 1. You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation principles in mind. Include private instance variables for the account number, account holder name, and account balance. Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. Ensure that the account balance cannot be accessed or modified directly.
 */

 class BankAccount {
    private int accountNumber ;
    private String accountHolderName;
    private Double accountBalance ;

    // constructor

    public BankAccount(int accountNumber , String accountHolderName , double accountBalance  ){

        this.accountNumber = accountNumber ;
        this.accountHolderName = accountHolderName ;
        this.accountBalance  =accountBalance ;
    }

public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber ;
}
    public int getAccountNumber(){
        return accountNumber ;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName ;
    }
 
    public String getAccountHolderName(){
        return accountHolderName  ;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance ;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    // METHODS For WITHDRAWAL AND DEPOSITE

    // FOR DEPOSITE

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    

        public void withdraw(double amount) {
            if (amount > 0 && accountBalance >= amount) {
                accountBalance -= amount;
            } else {
                System.out.println("Insufficient balance or invalid withdrawal amount.");
            }
        }

 }
 
 public class Task1{
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount(11002233, "Rehan", 5000);
        ba.setAccountBalance(25000);
        System.out.println("Account Number : "+ "$" + ba.getAccountNumber());
        System.out.println("Account Holder Name : " + ba.getAccountHolderName());
        System.out.println("Account Balance : " + ba.getAccountBalance());

        ba.deposit(1500);
        System.out.println("Your total balance after deposite " + ba.getAccountBalance());

        ba.withdraw(500);
        System.out.println("Your balance after withdrawl : " + ba.getAccountBalance());

        ba.withdraw(500000);
        


    }
 }