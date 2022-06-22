package com.plateer.ec1.payment.factory.impl;

import com.plateer.ec1.payment.factory.PaymentService;
import com.plateer.ec1.payment.factory.PaymentType;
import com.plateer.ec1.payment.vo.ApproveResVO;
import com.plateer.ec1.payment.vo.NetCancelReqVO;
import com.plateer.ec1.payment.vo.OriginalOrder;
import com.plateer.ec1.payment.vo.PayInfo;
import com.plateer.ec1.promotion.point.Point;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PayPoint implements PaymentService {

    private final Point point;

    @Override
    public void validateAuth(PayInfo payInfo) {}

    @Override
    public ApproveResVO approvePay(PayInfo payInfo) {
        log.info("-----------------Point approvePay start");
        point.usePoint(null, 0);
        return null;
    }

    @Override
    public void cancelPay(OriginalOrder originalOrder) {
        log.info("-----------------Point cancelPay start");
        point.cancelPoint(null, 0);
    }

    @Override
    public void netCancel(NetCancelReqVO netCancelReqVO) {}

    @Override
    public PaymentType getType() {
        return PaymentType.POINT;
    }
}
