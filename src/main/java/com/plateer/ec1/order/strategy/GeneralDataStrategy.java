package com.plateer.ec1.order.strategy;

import com.plateer.ec1.order.strategy.impl.DataStrategy;
import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;

public class GeneralDataStrategy implements DataStrategy {
    @Override
    public OrderDto create(OrderRequest orderRequest, OrderProductView orderProductView) {
        return null;
    }
}
