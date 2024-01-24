package implementartion_2;

public abstract class AnimalFactory {
    public void createAndDisplayAnimal(String color) {
        System.out.println("\nShowing common behaviors of an animal");
        Animal animal;
        animal = createAnimal(color);
        // common code
        animal.displayBehavior();
    }

    // This is the "factory method"
    // Notice that I defer the instantiation process
    // to the subclasses.
    protected abstract Animal createAnimal(String color);
}
