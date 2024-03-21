package implementation_2;

class CarMaker {
    BasicCar nano, ford;

    public CarMaker() {
        nano = new Nano("Nano XM624 cc");
        ford = new Ford("Ford Aspire");
    }

    public BasicCar getNano() throws CloneNotSupportedException {
        return nano.clone(); // Clone the object, to avoid modify the original object
    }
    public BasicCar getFord() throws CloneNotSupportedException {
        return ford.clone(); // Clone the object, to avoid modify the original object
    }
}
