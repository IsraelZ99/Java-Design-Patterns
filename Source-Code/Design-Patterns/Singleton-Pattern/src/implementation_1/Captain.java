package implementation_1;

// This class is declared as 'final'
// So, it cannot have a subclass
final class Captain {
    private static Captain captain;

    // Making the constructor private
    // to prevent the use of "new"
    private Captain() {
    }

    // This method as synchronized, means that multiple threads
    // cannot involve in the instantiation process at the same
    // time. It enables you to force each thread to wait for
    // its turn to access this method.
    public static synchronized Captain getCaptain() {
        // Lazy initialization
        // This means you only create the object until you need it
        // Also, delay the object creation process to avoid expensive
        // processes to create an object
        if (captain == null) {
            captain = new Captain();
            System.out.println("\t A new captain is selected for your team");
        } else {
            System.out.println("\tYou already have a captain for your team");
            System.out.println("\tSend him for the toss.");
        }
        return captain;
    }
}
