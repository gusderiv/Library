// Usuario o Persona
abstract class User {

    //protected String password;
    //protected String email;
      protected String name;
      protected String surname;

      public User(String name, String surname){
          this.name = name;
          this.surname = surname;
      }


    public abstract void setPassword(String password);
    public abstract void setEmail(String email);

    public void doLogin(String password, String email){}

    @Override
    public String toString(){
        return "Name: " + name + "Surname: " + surname;
    }
}
