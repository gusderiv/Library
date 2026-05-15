import java.util.Scanner;

public class LibraryEngine {
    ListBooks listBooks = new ListBooks();
    Scanner sc = new Scanner(System.in);

    Book book1 = new Book("Harry Potter y la Piedra Filosofal","fantasia-misterio","J.K Rowling", 3, true, 123 );
    Book book2 = new Book("Harry Potter y la Cámara Secreta","fantasia-misterio","J.K Rowling", 3, true, 456 );
    Book book3 = new Book("Harry Potter y el Prisionero de Azkabá","fantasia-misterio","J.K Rowling", 3, true, 789 );

    public void Test(){
        listBooks.InsertBook(book1);
        listBooks.InsertBook(book2);

        System.out.println("information in the list");
        listBooks.ShowBooks();
    }



}
