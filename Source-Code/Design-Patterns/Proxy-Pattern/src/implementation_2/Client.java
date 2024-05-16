package implementation_2;

import implementation_2.components.*;

/**
 * The client is talking to a ConcreteSubject instance
 * through a proxy method
 */
class Client {
    public static void main(String[] args) {
        System.out.println("*** Modified Proxy Pattern Demonstration.***");
        // Admin is an authorized user
        Subject proxy = new ProxySubject();
        proxy.doSomeWork("Admin");
        // Robin is an unauthorized user
        proxy.doSomeWork("Robin");
    }
}
