package com.plateer.ec1.payment.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class PaymentServiceFactory {

    private final Map<PaymentType, PaymentService> map = new HashMap();

    public PaymentServiceFactory(Inicis inicis, PayPoint payPoint) {
        map.put(PaymentType.INICIS, inicis);
        map.put(PaymentType.POINT, payPoint);
    }

    public PaymentService getPaymentService(PaymentType type){
        log.info("-----------------PaymentServiceFactory start");
        return map.get(type);
    }
}
