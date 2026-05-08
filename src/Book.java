public class Book {

    private String nameBook;
    private String genre;
    private String author;
    private int stock;
    private boolean state;

    public Book(String nameBook, String genre, String author, int stock, boolean state) {
        this.nameBook = nameBook;
        this.genre = genre;
        this.author = author;
        this.stock = stock;
        this.state = state;
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

    public void setState(boolean state) {
        this.state = state;
    }
    @Override
    public String toString(){
        return "Title: "+ nameBook + " Genre: " + genre + " Author: " + author + " Stock: " + stock + " State: " + state;
    }


}
