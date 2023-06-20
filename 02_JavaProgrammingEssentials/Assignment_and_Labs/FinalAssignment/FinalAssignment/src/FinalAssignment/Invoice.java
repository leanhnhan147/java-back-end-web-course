package FinalAssignment;

public class Invoice implements Payable{

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    private String partNumbet;
    private String partDesciption;
    private int quantity;
    private double pricePerItem;
}
