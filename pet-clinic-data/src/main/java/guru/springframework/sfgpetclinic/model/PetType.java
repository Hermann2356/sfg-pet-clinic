package guru.springframework.sfgpetclinic.model;
/*
* Created by Hermann Sterling
* 08/25/2020
*/
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
