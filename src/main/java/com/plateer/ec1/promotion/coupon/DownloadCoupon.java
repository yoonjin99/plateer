package com.plateer.ec1.promotion.coupon;

import com.plateer.ec1.promotion.vo.Promotion;

public class DownloadCoupon {
    private Promotion promotion;
    private String memberNo;

    private boolean checkAvailableDownloadCoupon(String memberNo, Promotion promotion){
        return true;
    }

    public Promotion downloadCoupon(String memberNo, Promotion promotion){
        return null;
    }
}
