public class Encadreur extends Person{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Encadreur(int id, String email, String password) {
        super(id, email, password);
    }


}
