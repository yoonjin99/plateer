package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.factory.PaymentService;
import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import com.plateer.ec1.payment.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PayService {
    private final PaymentServiceFactory paymentServiceFactory;

    public ApproveResVO approve(PayInfo payInfo){
        log.info("---------------PayService approve start---------------------");
        PaymentService paymentService = paymentServiceFactory.getPaymentService(payInfo.getPaymentType());
        return paymentService.approvePay(payInfo);
    }

    public void cancel(CancelReqVO cancelReqVO){
        log.info("---------------PayService cancel start---------------------");
        PaymentService paymentService = paymentServiceFactory.getPaymentService(cancelReqVO.getPaymentType());
        OriginalOrder originalOrder = new OriginalOrder();
        paymentService.cancelPay(originalOrder);
    }

    public void netCancel(NetCancelReqVO netCancelReqVO){
        log.info("---------------PayService netCancel start---------------------");
    }
}
