package implementation_3;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo using Eager Initialization***\n");

        // First implementation:
        // Call dummy method to check the implementation of EAGER INITIALIZATION.
        // This implementation has cons, because the class is instantiated at the beginning
        // and after call the method
        Captain.dummyMethod();

        System.out.println("Trying to make a captain for your team.");
        //Constructor is private. We cannot use "new" here.
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same instance.");
        }
    }
}
