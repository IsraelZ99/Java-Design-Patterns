package implementation_1;

/**
 * The Director: is responsible for creating the final
 * object using the Builder interface.
 * Director decides the sequence of steps to
 * build the product.
 */
// Director class
abstract class Director {
    // Director know how to use/instruct the
    // builder to create a vehicle
    public abstract Vehicle instruct(Builder builder);
}
