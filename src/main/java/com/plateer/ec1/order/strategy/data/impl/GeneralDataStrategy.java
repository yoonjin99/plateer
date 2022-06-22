package com.plateer.ec1.order.strategy.data.impl;

import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralDataStrategy implements DataStrategy {
    @Override
    public OrderDto create(OrderRequest orderRequest, OrderProductView orderProductView) {
        log.info("-----------------general data create start-----------------");
        return null;
    }
}
