package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/*
 * Created by Hermann Sterling
 * 08/25/2020
 */
public class Vet extends Person {
    private Set<Specialty> specialities;

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
