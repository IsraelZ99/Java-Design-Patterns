package implementartion_2;

public class DogFactory extends AnimalFactory {

    // Creating and returning a 'Dog' instance
    @Override
    protected Animal createAnimal(String color) {
        return new Dog(color);
    }
}
