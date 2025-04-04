import java.util.Date;

public class Role {

    private int id;
    private String label;
    private Date createdAt;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role(int id, String label, Date createdAt) {
        this.id = id;
        this.label = label;
        this.createdAt = createdAt;
    }


}
