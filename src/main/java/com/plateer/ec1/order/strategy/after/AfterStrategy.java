package com.plateer.ec1.order.strategy.after;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;

public interface AfterStrategy {
    public void call(OrderRequest orderRequest, OrderDto orderDto);
}
