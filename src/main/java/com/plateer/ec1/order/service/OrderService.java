package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.BoAfterStrategy;
import com.plateer.ec1.order.strategy.EcouponDataStrategy;
import com.plateer.ec1.order.strategy.FoAfterStrategy;
import com.plateer.ec1.order.strategy.GeneralDataStrategy;
import com.plateer.ec1.order.strategy.impl.AfterStrategy;
import com.plateer.ec1.order.strategy.impl.DataStrategy;
import com.plateer.ec1.order.validator.OrderValidator;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderHistoryService orderHistoryService;
    private final PaymentService paymentService;

    public void order(OrderRequest orderRequest){
        OrderContext orderContext = new OrderContext(orderHistoryService, paymentService);
        orderContext.execute(this.getDataStrategy(orderRequest), this.getAfterStrategy(orderRequest), orderRequest);
    }

    private DataStrategy getDataStrategy(OrderRequest orderRequest){
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
