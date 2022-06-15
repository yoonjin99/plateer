package com.plateer.ec1.order.service;

import com.plateer.ec1.order.model.OrderBaseModel;
import com.plateer.ec1.order.model.OrderClaimModel;
import com.plateer.ec1.order.model.OrderProductModel;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;

public class OrderModelCreators {
    public static OrderBaseModel commonOrderBase(OrderRequest orderRequest, OrderProductView orderProductView){
        return null;
    }

    public static OrderProductModel commonOrderProduct(OrderRequest orderRequest, OrderProductView orderProductView){
        return null;
    }

    public static OrderClaimModel commonOrderClaim(OrderRequest orderRequest, OrderProductView orderProductView){
        return null;
    }
}
