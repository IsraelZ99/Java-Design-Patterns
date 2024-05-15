package implementation_4;

class Client {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo using Bill Pugh's technique***\n");
        // This dummy method is call without instantiate the class
        Captain.dummyMethod();

        System.out.println("Trying to make a captain for your team.");
        //Constructor is private. We cannot use "new" here.
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2){
            System.out.println("captain1 and captain2 are the same instance.");
        }
    }
}
