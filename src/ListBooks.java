import java.util.ArrayList;
import java.util.List;

public class ListBooks {

    List<Book> listbooks;

    public ListBooks(){
        this.listbooks = new ArrayList<>();
    }

    //public void InsertBook(String nameBook, String genre, String author, int stock, boolean state, int isbn){
    public void InsertBook(Book book){
       //listbooks.add(new Book(nameBook, genre,author,stock, state,isbn));
        listbooks.add(book);
       FindBookByIsbn(book.getISBN());


    }

    public Book FindBookByIsbn(int isbn){

        Book book = null;

        for (Book findBook : listbooks){
            if(findBook.getISBN()==isbn){
                book = findBook;
            }
        }

        return book;
    }

    //mover al engine
    public void ShowBooks(){
        for(Book boook : listbooks){
            System.out.println(boook.toString());

        }

    }

}
