package simplefactory;

public class Dog implements Animal {
    public Dog() {
        System.out.println("\nA dog us created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow.");
        System.out.println("It prefers barking.");
    }
}
