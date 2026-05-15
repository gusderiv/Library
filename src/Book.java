public class Book {

    private String name;
    private String genre;
    private String author;
    private int stock;
    private boolean state;
    private int isbn;

    public Book(String name, String genre, String author, int stock, boolean state, int isbn) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.stock = stock;
        this.state = state;
        this.isbn = isbn;
    }

    public String getName() {return name;}

    public void setName(String nameBook) {
        this.name = nameBook;
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
        //return "Title: "+ nameBook + "ISBN: " + isbn + " Genre: " + genre + " Author: " + author + " Stock: " + stock + " State: " + state;
        return "Title: " + name + "\n" +
                "ISBN: " + isbn + "\n" +
                "Genre: " + genre + "\n" +
                "Author: " + author + "\n" +
                "Stock: " + stock + "\n" +
                "State: " + (state ? "Available" : "Not Available")+"\n";
    }


}
