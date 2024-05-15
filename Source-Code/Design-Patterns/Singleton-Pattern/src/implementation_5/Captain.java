package implementation_5;

// ENUM Singleton
// This was doing by Joshua Bloch
enum Captain {
    INSTANCE;

    // This method is uses to get dummy the instance
    public static Captain getInstance() {
        return INSTANCE;
    }

    public synchronized void getCaptain() {
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
    }
}
