package implementation_2.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This is the proxy class. It invokes the doSomeWork()
// from the ConcreteSubject
public class ProxySubject extends Subject {
    private Subject subject;
    // String[] registeredUsers;
    String currentUser;
    List<String> registeredUsers;

    // You can also simply create this mutable list in one step
    // List<String> registeredUsers = new ArrayList<>(Arrays.asList("Admin", "Robin","Sam"));


    public ProxySubject() {
        // We need to create only one instance of the ConcreteSubject
        if (subject == null) subject = new ConcreteSubject();
        // Initialize the registered users
        registeredUsers = new ArrayList<>();
        registeredUsers.add("Admin");
        registeredUsers.add("Kate");
        registeredUsers.add("Sam");
    }

    @Override
    public void doSomeWork(String user) {
        System.out.println("\n The proxy call is happening now.");
        System.out.println(user + " wants to invoke a proxy method.");
        if (registeredUsers.contains(user)) {
            subject.doSomeWork(user);
        } else {
            System.out.println("Sorry, " + user + ", you do not have the access rights.");
        }
    }
}
