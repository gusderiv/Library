public class Administrator extends Person{
    private int id_Administrator;

    public Administrator(String email, String password, String name, String lastName, int id_Administrator){
        super(email,password,name, lastName);
        this.id_Administrator= id_Administrator;
    }

    @Override
    public String toString(){
        return super.toString() + " id: " + id_Administrator;
    }

    @Override
    public boolean Login() {
        boolean state = false;
        return state;
    }

    @Override
    public void CheckProfile() {

    }

    @Override
    public void SearchBooks() {

    }

}
