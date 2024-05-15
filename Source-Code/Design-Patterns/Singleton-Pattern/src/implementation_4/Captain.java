package implementation_4;

// Bill Pugh's Singleton
class Captain {

    private Captain() {
        System.out.println("\tA new captain is elected for your team.");
    }

    // The helper class
    private static class SingletonHelper {
        // This nested class is referenced after the getCaptain() is called
        // When you call at the first time, will instantiate the class
        // In further calls, it's going to return the instantiation was already created
        private static final Captain CAPTAIN_INSTANCE = new Captain();
    }

    public static Captain getCaptain() {
        return SingletonHelper.CAPTAIN_INSTANCE;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }
}
