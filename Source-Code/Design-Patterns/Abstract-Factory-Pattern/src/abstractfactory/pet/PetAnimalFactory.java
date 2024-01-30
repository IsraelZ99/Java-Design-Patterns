package abstractfactory.pet;

import abstractfactory.AnimalFactory;
import abstractfactory.Dog;
import abstractfactory.Tiger;

// Concrete Factory2: Pet animal factory
public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal factory.\n");
    }

    @Override
    protected Tiger createTiger(String color) {
        return new PetTiger(color);
    }

    @Override
    protected Dog createDog(String color) {
        return new PetDog(color);
    }
}
