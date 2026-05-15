import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListBooksTestInsertBook {

    @Test
    void insertBook() {
        //craeate new object
        Book newBook = new Book("Harry Potter y la Piedra Filosofal","fantasia-misterio","J.K Rowling", 3, true, 123 );

        //create the listbook
        ListBooks list = new ListBooks();
        list.InsertBook(newBook);



    }
}