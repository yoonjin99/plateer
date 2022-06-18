package com.plateer.ec1.order.strategy.after.impl;

import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FoAfterStrategy implements AfterStrategy {
    @Override
    public void call(OrderRequest orderRequest, OrderDto orderDto) {
        log.info("FO 후처리 호출");
    }
}
