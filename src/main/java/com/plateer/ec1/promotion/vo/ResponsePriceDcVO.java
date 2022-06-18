package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResponsePriceDcVO extends ResponseBaseVO{
    private List<Product> productList;
}
