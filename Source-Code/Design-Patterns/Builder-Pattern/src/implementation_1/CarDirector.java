package implementation_1;

/**
 * The CarDirector directs the
 * car's instantiation steps
 */
// Concrete Director class
class CarDirector extends Director {
    // The car director follows
    // its own sequence:
    // Make body -> add wheels -> then add brand name
    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
