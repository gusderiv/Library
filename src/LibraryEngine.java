import java.util.Scanner;


public class LibraryEngine {
    ListBooks listBooks = new ListBooks();
    Scanner sc = new Scanner(System.in);
    int option;

    public void Menu1() {


        System.out.println("_______________________");
        System.out.println("Welcome to our library!");
        System.out.println("------------------------");

        System.out.println("Choose an option: ");
        System.out.println("");
        System.out.println("1- Login");
        System.out.println("2- Sign up");
        System.out.println("3- Consult Books");
        System.out.print("Option: ");
        option = sc.nextInt();

    }

    public void Menu1Engine(){
        switch (option) {
            case 3:
                System.out.println("Has elegido la opción 3");
                break;
        }
    }

    Book book1 = new Book("Harry Potter y la Piedra Filosofal","fantasia-misterio","J.K Rowling", 3, true, 123 );
    Book book2 = new Book("Harry Potter y la Cámara Secreta","fantasia-misterio","J.K Rowling", 3, true, 456 );
    Book book3 = new Book("Harry Potter y el Prisionero de Azkabá","fantasia-misterio","J.K Rowling", 3, true, 789 );

    public void Test(){
        listBooks.InsertBook(book1);
        listBooks.InsertBook(book2);

        System.out.println("Information in the list");
        listBooks.ShowBooks();
    }



}
