package implementation_1;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team.");
        // Constructor is private, thus we cannot use "new" keyword.
        // Captain captain = new Captain() // error
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying t make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if(captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same.");
        }
    }
}
