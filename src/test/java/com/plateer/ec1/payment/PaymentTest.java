package com.plateer.ec1.payment;

import com.plateer.ec1.payment.factory.PaymentType;
import com.plateer.ec1.payment.service.PayService;
import com.plateer.ec1.payment.vo.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PaymentTest {

    @Autowired
    public PayService payService;

    @Test
    void payment(){
        log.info("---------------payment test 실행---------------------");
        PayInfo info = new PayInfo();
        info.setPaymentType(PaymentType.INICIS);
        payService.approve(info);
        log.info("---------------payment test 종료---------------------");
    }
}
