public class Book
{
     int bookID;
     String bookname;
    //constructor to initialize roll number and name of the student
    Book( int bookid, String bookName)
    {
        bookID = bookid;
        bookname = bookName;
    }
    //creating a copy constructor
    Book(Book book)
    {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        bookID = book.bookID;
        bookname = book.bookname;
    }
    //creating a method that returns the id of the book
    int showed()
    {
        return bookID;
    }
    //creating a method that returns the name of the book
    String showName()
    {
        return bookname;
    }
    //class to create student object and print roll number and name of the student
    public static void main(String[] args)
    {
        Book b1 = new Book(399782, "Wings Of Fire");
        System.out.println("Name of the first book: "+ b1.showName());
        System.out.println("Price of the first book: "+ b1.showed());
//passing the parameters to the copy constructor
        Book b2 = new Book(b1);
        System.out.println("Name of the second book: "+ b2.showName());
        System.out.println("Price of the second book: "+ b2.showed());
    }
}
