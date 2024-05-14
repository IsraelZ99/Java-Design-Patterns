package implementation_1;

/**
 * The CarDirector directs the
 * car's instantiation steps.
 */
class MotorCycleDirector extends Director {

    // The car director follows
    // its own sequence:
    // Make body -> add wheels -> then add the brand name
    @Override
    public Vehicle instruct(Builder builder) {
        builder.addBrandName();
        builder.buildBody();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
