public class Etudiant extends Person{
    protected String code;

    public Etudiant(int id, String email, String password) {
        super(id, email, password);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
