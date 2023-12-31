package without_lsp;

public class RegisteredUserPayment implements Payment{

    String name;

    public RegisteredUserPayment(String username) {
        this.name = username;
    }
    
    @Override
    public void previousPaymentInfo() {
        System.out.println("Retrieving " + name + "'s last payment details.");
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
