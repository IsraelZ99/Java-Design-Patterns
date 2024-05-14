package implementation_1;

/**
 * Builder: contains the methods to build different parts
 * of a product.
 */
// This is the common interface
interface Builder {
    void addBrandName();
    void buildBody();
    void insertWheels();
    Vehicle getVehicle();
}
