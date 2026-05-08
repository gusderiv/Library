public class RegisteredUser extends Person{
    private int id_User;
    private String address;
    private boolean state;

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public RegisteredUser(String email, String password, String name, String lastName, int id_User, String address, boolean state) {
        super(email, password, name, lastName);
        this.id_User = id_User;
        this.address = address;
        this.state = false;
    }

    @Override
    public boolean Login() {
        return false;
    }

    @Override
    public void CheckProfile() {

    }

    @Override
    public void SearchBooks() {

    }
}
