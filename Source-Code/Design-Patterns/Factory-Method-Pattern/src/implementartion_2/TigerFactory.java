package implementartion_2;

import java.util.Collection;

public class TigerFactory extends AnimalFactory {

    // Creating and returning a 'Tiger' instance
    @Override
    protected Animal createAnimal(String color) {
        return new Tiger(color);
    }
}
