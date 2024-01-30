package abstractfactory;

import abstractfactory.pet.PetAnimalFactory;
import abstractfactory.wild.WildAnimalFactory;

// Factory provider
// (It is optional for you)
class FactoryProvider {
    public static AnimalFactory getFactory(String factoryType) {
        if (factoryType.contains("wild")) {
            return new WildAnimalFactory();
        } else if (factoryType.contains("pet")) {
            return new PetAnimalFactory();
        } else {
            throw new IllegalArgumentException("You need to pass either wild or pet as argument.");
        }
    }
}
