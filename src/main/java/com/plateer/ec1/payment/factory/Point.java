package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.vo.ApproveResVO;
import com.plateer.ec1.payment.vo.NetCancelReqVO;
import com.plateer.ec1.payment.vo.OriginalOrder;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Point implements PaymentService{

    @Override
    public void validateAuth(PayInfo payInfo) {
        log.info("-----------------Point validateAuth start");
    }

    @Override
    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("-----------------Point approvePay start");
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder originalOrder) {
        log.info("-----------------Point cancelPay start");
    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {
        log.info("-----------------Point netCancel start");
    }
}
