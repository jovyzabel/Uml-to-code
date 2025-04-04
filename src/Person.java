import java.util.Date;

public abstract class Person extends User{
    protected String name;
    protected String firstName;
    protected Date bitrhDate;
    protected String tel;
    protected String address;

    public Person(int id, String email, String password) {
        super(id, email, password);
    }

}
