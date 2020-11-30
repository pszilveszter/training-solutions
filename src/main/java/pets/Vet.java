package pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> pets = new ArrayList<>();

    public void add(Pet newPet) {
        for (Pet pet : pets) {
            if (areEquals(pet, newPet)) {
                return;
            }
        }
        pets.add(newPet);
    }

    private boolean areEquals(Pet pet, Pet newPet) {
        return newPet.getReg().equals(pet.getReg());
    }

    public List<Pet> getPets() {
        return pets;
    }
}