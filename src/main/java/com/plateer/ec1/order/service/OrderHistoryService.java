package com.plateer.ec1.order.service;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderHistoryService {
    public Long insertOrderHistory(OrderRequest orderRequest){
        log.info("------------------insertOrderHistory start");
        return 1L;
    }

    public Long updateOrderHistory(Long historyNo, OrderDto orderDto){
        log.info("------------------updateOrderHistory start");
        return 1L;
    }
}
