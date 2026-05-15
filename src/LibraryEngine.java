import java.util.Scanner;


public class LibraryEngine {
    ListBooks listBooks = new ListBooks();
    Scanner sc = new Scanner(System.in);

//primera pantalla
    public void FirstMenu() {


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
        FirstMenuEngine(option);
    }

    public void FirstMenuEngine(String option){
        switch (option) {
            case "1":
                System.out.println("Has elegido la opción 1");
                LoginScreen(); //Habrá que cambiar de pantalla en cada opción
                // Login();
            break;
            case "2":
                System.out.println("Has elegido la opción 2");
                // SignUpScreen();
                // ValidateNewUsers();
            break;
            case "3":
                System.out.println("Has elegido la opción 3");
                // BrowserScreen();
                // ShowBooks();
                break;
        }

    }
// segunda pantalla

    public void LoginScreen(){
        System.out.println("_______________________________________________________________________________________");
        System.out.println("                                    LOGIN                                              ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println(" ");

        System.out.println("__Who are you?___");
        System.out.println("1- I'm a user");
        System.out.println("2- I'm a administrator");
        System.out.print("--> ");
        String identification = sc.nextLine();

        System.out.println("__Insert your data___");
        System.out.print("--> Name: ");
        String personName = sc.nextLine();
        System.out.print("--> Password: ");
        String personPassword = sc.nextLine();
        System.out.println(" ");
       System.out.println(" ");
       LoginScreenEngine(personPassword);
    }
    public void LoginScreenEngine( String personPassword ){
        if(personPassword != "0"){
            System.out.println("                                ....Loading....                                    ");
        }
    }

// tercera pantalla sign up
    public void SingUpScreen(){

    }
    public void SingUpScreenEngine(){

    }

// cuarta pantalla consult books



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
