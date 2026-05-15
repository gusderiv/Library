import java.util.Scanner;


public class LibraryEngine {
    ListBooks listBooks = new ListBooks();
    Scanner sc = new Scanner(System.in);


    public void Menu1() {


        System.out.println("______________________________________________________________________________________");
        System.out.println("                               WELCOME TO OUR LIBRARY                                 ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("");
        System.out.println("Choose an option: ");
        System.out.println("1- Login");
        System.out.println("2- Sign up");
        System.out.println("3- Consult Books");
        System.out.print("Option: ");
        String option = sc.nextLine();
        Menu1Engine(option);
    }

    public void Menu1Engine(String option){
        switch (option) {
            case "1":
                System.out.println("Has elegido la opción 1");
            break;
            case "2":
                System.out.println("Has elegido la opción 2");
            break;
            case "3":
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
        listBooks.InsertBook(book3);

        System.out.println("Information in the list");
        listBooks.ShowBooks();
    }



}
