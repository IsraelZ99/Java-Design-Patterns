package implementation_2;

// Lazy initialization
class Captain {
    private static Captain captain;
    static int numberOfInstance = 0;

    // Making the constructor private to prevent
    // the use of "new"
    private Captain() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment= " + numberOfInstance);
    }

    public static synchronized Captain getCaptain() {
        // Lazy initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("\t A new captain is selected for your team");
        } else {
            System.out.println("\tYou already have a captain for your team");
            System.out.println("\tSend him for the toss.");
        }
        return captain;
    }

    // A non-static nested class (inner class)
    public class CaptainDerived extends Captain {
        // Some code
    }

}
