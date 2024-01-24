package simplefactory.qa;

import simplefactory.Animal;
import simplefactory.Dog;
import simplefactory.Tiger;

public class AnimalFactory2 {

    public Animal createAnimal(AnimalType animalType) {
        Animal animal;
        if (animalType.equals(AnimalType.DOG)) {
            animal = new Dog();
        } else if (animalType.equals(AnimalType.TIGER)) {
            animal = new Tiger();
        } else {
            System.out.println("You can create either a 'dog' or a 'tiger'. ");
            throw new IllegalArgumentException("Unknown animal cannot be instantiated.");
        }
        return animal;
    }
}
