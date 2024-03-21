package implementation_3;

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Modified Demo***\n");

        CarMaker carMaker = new CarMaker();

        // Working with a Nano car
        BasicCar nano = carMaker.getNano();
        System.out.println(nano);
        System.out.println("----------");

        // Getting a cloned version of Nano
        BasicCar clonedCar;
        clonedCar = nano.clone();
        // Working with the cloned Nano
        printCarDetail(clonedCar);

        System.out.println("----------\n");
        BasicCar ford = carMaker.getFord();
        System.out.println(ford);
        System.out.println("----------");

        // Getting a cloned version of Ford
        clonedCar = ford.clone();
        // Working with the cloned Ford
        printCarDetail(clonedCar);
        System.out.println("----------\n");
    }

    public static void printCarDetail(BasicCar car) {
        System.out.println("Editing a cloned model:");
        System.out.println("Model: " + car.modelName);
        // Editing the on-Road price of a car
        // This is an optional step
        System.out.println("Price modification");
        car.onRoadPrice += 100;
        System.out.println("Its on road-price: $" + car.onRoadPrice);
    }
}
