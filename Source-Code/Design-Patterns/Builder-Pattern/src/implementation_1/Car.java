package implementation_1;

// Concrete products
class Car extends Vehicle {
    String brandName;

    public Car(String brandName) {
        this.brandName = brandName;
        System.out.println("\nWe are about to make a " + brandName + " car.");
    }
}
