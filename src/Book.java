public class Book {

    private String nameBook;
    private String genre;
    private String author;
    private int stock;
    private boolean state;
    private int isbn;

    public Book(String nameBook, String genre, String author, int stock, boolean state, int isbn) {
        this.nameBook = nameBook;
        this.genre = genre;
        this.author = author;
        this.stock = stock;
        this.state = state;
        this.isbn = isbn;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isState() {
        return state;
    }

    public int getISBN() { return isbn;    }

    public void setISBN(int isbn) {  this.isbn = isbn;  }


    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return "Title: "+ nameBook + "ISBN: " + isbn + " Genre: " + genre + " Author: " + author + " Stock: " + stock + " State: " + state;
    }


}
