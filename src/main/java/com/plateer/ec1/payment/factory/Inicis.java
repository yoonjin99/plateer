package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.vo.ApproveResVO;
import com.plateer.ec1.payment.vo.NetCancelReqVO;
import com.plateer.ec1.payment.vo.OriginalOrder;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Inicis implements PaymentService{

    @Override
    public void validateAuth(PayInfo payInfo) {
        log.info("-----------------Inicis validateAuth start");
    }

    @Override
    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("-----------------Inicis approvePay start");
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder originalOrder) {
        log.info("-----------------Inicis cancelPay start");

    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {
        log.info("-----------------Inicis netCancel start");
    }
}
