package simplefactory.qa;

import simplefactory.Animal;

public class Client2 {
    public static void main(String[] args) {
        System.out.println("*** Simple Factory Demonstration-2.***");
        AnimalFactory2 factory = new AnimalFactory2();

        Animal animal = factory.createAnimal(AnimalType.DOG);
        animal.displayBehavior();

        animal = factory.createAnimal(AnimalType.TIGER);
        animal.displayBehavior();
    }
}
