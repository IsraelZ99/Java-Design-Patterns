package implementation_1;

import java.util.LinkedList;

/**
 * Product: is the complex object, is the final
 * outcome.
 * The Vehicle class is used to create the products.
 * Making the class abstract, so that
 * you cannot instantiate from it directly.
 */
abstract class Vehicle {
    /*
     * You can use any data structure that you prefer.
     * I have used LinkedList<String> in this case.
     */
    private LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
