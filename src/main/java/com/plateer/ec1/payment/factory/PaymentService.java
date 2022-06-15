package com.plateer.ec1.payment.factory;

public interface PaymentService {
    public void validateAuth();
    public void approvePay();
    public void cancelPay();
    public void netCancel();
}
