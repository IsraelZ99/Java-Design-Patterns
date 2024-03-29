package implementation_4;

public class EmpAddress implements Cloneable{
    String address;

    public EmpAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address;
    }

    public EmpAddress cloneAddress() throws CloneNotSupportedException {
        // Shallow Copy
        return (EmpAddress) this.clone();
    }
}
