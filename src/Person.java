abstract class Person {

    protected String email;
    protected String password;
    protected String name;
    protected String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person( String email, String password, String name, String lastName){

        this.name= name;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
            //return STR."name: \{name} lastName: \{lastName} email: \{email}";

        return "Name: " + name + "\n" +
                "Last Name: " + lastName + "\n" +
                "Email: " + email;
    }

    public abstract boolean Login();
    public abstract void CheckProfile();
    public abstract void SearchBooks();


}
