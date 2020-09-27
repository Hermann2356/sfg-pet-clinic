package guru.springframework.sfgpetclinic.model;

public class Specialty extends BaseEntity{
    private String description;
    /*
     * Created by Hermann Sterling
     * 09/27/2020
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
