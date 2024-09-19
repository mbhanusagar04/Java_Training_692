package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

public interface PaymentMethod {
	String getMethod();
    double applyDiscount( double amount, int quantity);
    void generatePayment(String orderSummary, double totalAmount);
    

}
