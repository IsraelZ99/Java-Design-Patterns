package lombok_implementation;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new Student();
        Student s = builder.name("Israel")
                .lastName("Garcia")
                .age(24)
                .build();
        System.out.println(s);
        Student s1 = builder.name("Guadalupe")
                .lastName("Arriaga")
                .age(25)
                .build();
        System.out.println(s1);
    }
}
