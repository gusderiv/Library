import java.util.ArrayList;
import java.util.List;

public class ListBooks {

    List<Book> listbooks;

    public ListBooks(){
        this.listbooks = new ArrayList<>();
    }



    public void InsertBook(String nameBook, String genre, String author, int stock, boolean state, int isbn){

       listbooks.add(new Book(nameBook, genre,author,stock, state,isbn));

       setBookByIsbn(isbn);

    }

    public Book setBookByIsbn(int isbn){

        Book book = null;

        for (Book findBook : listbooks){
            if(findBook.getISBN()==isbn){
                book = findBook;
            }
        }

        return book;

    }





}
