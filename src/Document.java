import java.util.Date;

public class Document {

    public Document(String statut, Date publishedAt, Date createdAt, String nature, int id) {
        this.statut = statut;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.nature = nature;
        this.id = id;
    }

    private int id;
    private String nature;
    private Date createdAt;
    private Date publishedAt;
    private String statut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}
