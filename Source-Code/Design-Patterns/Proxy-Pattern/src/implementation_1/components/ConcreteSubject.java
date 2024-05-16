package implementation_1.components;

// The ConcreteSubject class
class ConcreteSubject extends Subject {

    ConcreteSubject() {
    }

    // Implementing doSomeWork method
    @Override
    public void doSomeWork() {
        System.out.println("The doSomeWork() is executed");
    }

}
