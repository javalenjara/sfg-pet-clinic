package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by javalenja on 25-Apr-20
 */

public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
