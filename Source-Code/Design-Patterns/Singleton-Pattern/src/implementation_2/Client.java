package implementation_2;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team.");
        // Constructor is private. We cannot use "new" here.
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same.");
        }

        // As you can see, Captain class isn't final, it can allow to create new instances
        // of subclasses (it can prevent this, marking Captain class as final)
        Captain.CaptainDerived derived1 = captain1.new CaptainDerived();
        Captain.CaptainDerived derived2 = captain1.new CaptainDerived();
    }
}
