package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.payment.factory.PaymentService;
import com.plateer.ec1.payment.factory.PaymentType;
import com.plateer.ec1.payment.service.PayService;
import com.plateer.ec1.payment.vo.CancelReqVO;
import com.plateer.ec1.payment.vo.OriginalOrder;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Slf4j
@RequiredArgsConstructor
@Component
public class IFCallHelper {

    private final PayService payService;

    public void callRestoreCouponIF(ClaimModel claimModel){
        log.info("----------IFCallHelper 재고복원 실행--------");
    }

    public void callPaymentIF(ClaimModel claimModel){
        log.info("----------IFCallHelper 결제취소 실행--------");
        CancelReqVO cancelReqVO = new CancelReqVO();
        cancelReqVO.setPaymentType(PaymentType.valueOf(claimModel.getPaymentType().toUpperCase(Locale.ROOT)));
        payService.cancel(cancelReqVO);
    }
}
