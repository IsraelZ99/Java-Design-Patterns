package implementation_5;

class Client {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo using enum type***\n");
        // Method to show the Singleton Design Pattern
        // This is doing, using the get captain method through INSTANCE constant
        // this means, every call you will do return the same result and will not
        // instantiate anything.
        Captain.INSTANCE.getCaptain();
        System.out.println("Getting the instance " + Captain.getInstance());
    }
}
