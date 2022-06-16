package com.plateer.ec1.order.strategy.data;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;

public interface DataStrategy {
    OrderDto create(OrderRequest orderRequest, OrderProductView orderProductView);
}
