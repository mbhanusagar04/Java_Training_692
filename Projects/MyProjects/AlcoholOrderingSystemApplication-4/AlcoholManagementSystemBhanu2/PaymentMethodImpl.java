package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;

class PaymentMethodImpl implements PaymentMethod {
    private final String method;

    public PaymentMethodImpl(String method) {
        this.method = method;
    }

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public double applyDiscount(double amount, int quantity) {
        if (quantity >= 10) {
        	int discount =100;
            return discount ; // Apply a discount of 100 for orders of 10 or more
        }
        return 0;
    }
    public void generatePayment(String orderSummary, double amt) {
        System.out.println(orderSummary);
    }
}

