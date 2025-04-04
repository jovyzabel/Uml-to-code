import java.util.Date;

public class Promotion {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    private int id;
    private String label;
    private String cycle;
    private Date year;
    private String option;
    public Promotion(int id, String option, Date year, String cycle, String label) {
        this.id = id;
        this.option = option;
        this.year = year;
        this.cycle = cycle;
        this.label = label;
    }


}
