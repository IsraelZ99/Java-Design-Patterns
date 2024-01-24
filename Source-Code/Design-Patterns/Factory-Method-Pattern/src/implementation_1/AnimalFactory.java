package implementation_1;

public abstract class AnimalFactory {
    // This is the "factory method"
    // Notice that I defer the instantiation process
    // to the subclasses.
    protected abstract Animal createAnimal();
}
