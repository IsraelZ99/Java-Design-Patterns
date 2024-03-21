package implementation_3;

class CarMaker {
    BasicCar nano, ford;

    public CarMaker() {
    }

    public BasicCar getNano() throws CloneNotSupportedException {
        if (nano != null) {
            // A nano instance was created earlier.
            // Returning a clone of it.
            return nano.clone();
        } else {
            // Create a nano for the first time and return it.
            nano = new Nano("Nano XM624 cc"); // Clone the object, to avoid modify the original object
            return nano;
        }
    }

    public BasicCar getFord() throws CloneNotSupportedException {
        if (ford != null) {
            // A nano instance was created earlier.
            // Returning a clone of it.
            return ford.clone();
        } else {
            // Create a Ford for the first time and return it.
            ford = new Ford("Ford Aspire");
            return ford;
        }
    }
}
