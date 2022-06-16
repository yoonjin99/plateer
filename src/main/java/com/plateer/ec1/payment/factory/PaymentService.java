package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.vo.ApproveResVO;

public interface PaymentService {
    public void validateAuth();
    public ApproveResVO approvePay();
    public void cancelPay();
    public void netCancel();
}
