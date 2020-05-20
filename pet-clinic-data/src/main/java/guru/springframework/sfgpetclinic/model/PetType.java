package guru.springframework.sfgpetclinic.model;

/**
 * Created by javalenja on 25-Apr-20
 */

public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
