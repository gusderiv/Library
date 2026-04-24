//Cliente Registrado
public class LogedClient extends User {

    private String adress; //direccion
    public LogedClient(String adress, String name, String surname){
        super (name, surname);
        this.adress = adress;

    }

    public void setAdress( String adress){

    }

    @Override
    public String toString(){
        return "Adress: " + adress;
    }

}
