package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.after.impl.BoAfterStrategy;
import com.plateer.ec1.order.strategy.data.impl.EcouponDataStrategy;
import com.plateer.ec1.order.strategy.after.impl.FoAfterStrategy;
import com.plateer.ec1.order.strategy.data.impl.GeneralDataStrategy;
import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.payment.factory.PaymentService;
import com.plateer.ec1.payment.service.PayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class OrderService {

    private final OrderHistoryService orderHistoryService;
    private final PayService paymentService;

    public void order(OrderRequest orderRequest){
        log.info("-----------OrderService order start");
        OrderContext orderContext = new OrderContext(orderHistoryService, paymentService);
        orderContext.execute(getDataStrategy(orderRequest), getAfterStrategy(orderRequest), orderRequest);
    }

    private DataStrategy getDataStrategy(OrderRequest orderRequest){
        log.info("-----------GetDataStrategy start");
        DataStrategy dataStrategy = null;
        switch (orderRequest.getOrderType()){
            case "general":
                dataStrategy = new GeneralDataStrategy();
                break;
            case "coupon":
                dataStrategy = new EcouponDataStrategy();
                break;
        }
        return dataStrategy;
    }

    private AfterStrategy getAfterStrategy(OrderRequest orderRequest){
        log.info("-----------GetAfterStrategy start");
        AfterStrategy afterStrategy = null;
        switch (orderRequest.getSystemType()){
            case "FO":
                afterStrategy = new FoAfterStrategy();
                break;
            case "BO":
                afterStrategy = new BoAfterStrategy();
                break;
        }
        return afterStrategy;
    }
}
