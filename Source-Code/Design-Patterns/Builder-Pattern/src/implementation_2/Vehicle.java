package implementation_2;

import java.util.LinkedList;

/**
 * The Vehicle class is used to create the products.
 * Making the class abstract, so that
 * you cannot instance from it directly
 */
abstract class Vehicle {
    /*
     * You can use any data structure that you prefer.
     * I have used LinkedList<String> in this case
     */
    private LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        // Adding parts
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
