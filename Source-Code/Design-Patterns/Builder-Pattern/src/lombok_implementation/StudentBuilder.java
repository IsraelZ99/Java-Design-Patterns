package lombok_implementation;

interface StudentBuilder {
    StudentBuilder name(String name);
    StudentBuilder lastName(String lastName);
    StudentBuilder age(int age);

    Student build();
}
