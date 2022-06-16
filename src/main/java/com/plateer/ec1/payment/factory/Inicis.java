package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.vo.ApproveResVO;
import org.springframework.stereotype.Component;

@Component
public class Inicis implements PaymentService{
    @Override
    public void validateAuth() {

    }

    @Override
    public ApproveResVO approvePay() {
        return null;
    }

    @Override
    public void cancelPay() {

    }

    @Override
    public void netCancel() {

    }
}
