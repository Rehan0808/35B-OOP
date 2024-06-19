/*
 * 2. You are developing a library management system and need to implement a Book class. The Book class should have private instance variables for the book title, author name, and publication year. Implement appropriate getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.


 */

class Book {
    private String BookTitle;
    private String authorName;
 private int publicationYear; 
 private boolean isAvailable; 

 public void setBookTitle(String BookTitle){
    this.BookTitle = BookTitle ;
 }

 public String  getBookTitle(){
    return BookTitle;
 }

 public void  setAuthorName(String authorName){
    this.authorName = authorName ; 
 }

 public String getAuthorName(){
    return authorName ;
 }

 public void setPublicationYear(int publicationYear){
    this.publicationYear = publicationYear ;
 }

 public int getPublicationYear(){
    return publicationYear; 
 }


 public boolean isAvailable(){
    return isAvailable ; 
 }

 public Book(String BookTitle , String authorName , int publicationYear , boolean isAvailable){ // ya boolean isAvailable nw lekhda ni hunxa 
    this.BookTitle =BookTitle ;
    this.authorName = authorName ;
    this.publicationYear = publicationYear;
    this.isAvailable = true ;
 }

 
 public void borrow(){

    if (isAvailable) {

        isAvailable = false ;
        System.out.println("The book is taken ");

        
    }
    else{
        System.out.println("The book is alredy taken ");
    }

 }

 public void returnBook(){
    if (!isAvailable) {
        isAvailable = true ;
        System.out.println("The book has benn returned thank you");
        
    }

    else{
        System.out.println("The book is already been returned ");
    }
 }



}

public class TASK2{
   public static void main(String[] args) {
       
      Book b1 = new Book("Deepwork", "luis munich", 2008, false);

         System.out.println("Book Title: " + b1.getBookTitle());

         System.out.println("Author Name: " + b1.getAuthorName());
         System.out.println("Publication Year: " + b1.getPublicationYear());
         System.out.println("Is Available: " + b1.isAvailable());

         // borrowing book 
         b1.borrow();
         System.out.println("Is Available : " + b1.isAvailable());

         b1.borrow();

         b1.returnBook(); 
         System.out.println("Is Available : " + b1.isAvailable());

         b1.returnBook();
         

      }
   }
