package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import com.plateer.ec1.payment.vo.ApproveResVO;
import com.plateer.ec1.payment.vo.CancelReqVO;
import com.plateer.ec1.payment.vo.NetCancelReqVO;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PayService {
    private final PaymentServiceFactory paymentServiceFactory;

    public ApproveResVO approve(PayInfo payInfo){
        return null;
    }

    public void cancel(CancelReqVO cancelReqVO){

    }

    public void netCancel(NetCancelReqVO netCancelReqVO){

    }
}
