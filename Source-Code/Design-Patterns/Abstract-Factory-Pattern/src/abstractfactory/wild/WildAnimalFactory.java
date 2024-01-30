package abstractfactory.wild;

import abstractfactory.AnimalFactory;
import abstractfactory.Dog;
import abstractfactory.Tiger;

// Concrete Factory 1: Wild animal factory
public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("Your opt a wild animal factory.\n");
    }

    @Override
    protected Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    protected Dog createDog(String color) {
        return new WildDog(color);
    }
}
