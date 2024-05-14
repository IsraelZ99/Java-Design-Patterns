package implementation_1;

/**
 * Concrete builder: Assembles the parts of the product
 */
class MotorCycleBuilder implements Builder {
    Motorcycle motorcycle;

    public MotorCycleBuilder() {
        motorcycle = new Motorcycle("Honda");
    }

    @Override
    public void addBrandName() {
        motorcycle.add(" Adding the brand name: " + motorcycle.brandName);
    }

    @Override
    public void buildBody() {
        motorcycle.add(" Making the body of the motorcycle.");
    }

    @Override
    public void insertWheels() {
        motorcycle.add(" 2 wheels are added to the motorcycle");
    }

    @Override
    public Vehicle getVehicle() {
        return motorcycle;
    }
}
