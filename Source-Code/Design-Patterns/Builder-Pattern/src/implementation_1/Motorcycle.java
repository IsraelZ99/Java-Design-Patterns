package implementation_1;

// Concrete products
class Motorcycle extends Vehicle {
    String brandName;

    public Motorcycle(String brandName) {
        this.brandName = brandName;
        System.out.println("\nWe are about to make a " + brandName + " motorcycle.");
    }
}
