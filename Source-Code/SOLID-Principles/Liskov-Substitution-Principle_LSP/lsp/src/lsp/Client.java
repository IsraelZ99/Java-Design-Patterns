package lsp;

public class Client {

    public static void main(String[] args) {
        System.out.println("***A demo that follows the LSP.***\n");
        PaymentHelper helper = new PaymentHelper();

        // Instantiating two registered users.
        RegisteredUserPayment robin = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jack = new RegisteredUserPayment("Jack");
        // Instantiating a guest user's payment.
        GuestUserPayment guestUser1 = new GuestUserPayment();

        // Consolidating the previous payment's info to the helper
        helper.addPreviousPayment(robin); // Here LSP is implemented
        helper.addPreviousPayment(jack); // Here LSP is implemented

        // Consolidating new payment request to the helper
        helper.addNewPayment(robin); // Here LSP is implemented
        helper.addNewPayment(jack); // Here LSP is implemented
        helper.addNewPayment(guestUser1); // Here LSP is implemented

        // Retrieve all the previous payments of registered users.
        helper.showPreviousPayments();

        // Process all new payment requests from all users.
        helper.processNewPayments();
    }

}
