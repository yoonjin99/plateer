package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.model.ClaimModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ECouponCancelAcceptDataCreator extends ClaimDataCreator{
    @Override
    public ClaimModel updateOrderBenefitData(ClaimModel claimModel) {
        log.info("주문 혜택 업데이트 데이터 생성---------");
        return null;
    }

    @Override
    public ClaimModel insertOrderBenefitRelation(ClaimModel claimModel) {
        log.info("주문 혜택 등록 데이터 생성---------");
        return null;
    }

    @Override
    public ClaimModel updateOrderCost(ClaimModel claimModel) {
        log.info("주문 비용 업데이트 데이터 생성---------");
        return null;
    }

    @Override
    public ClaimModel insertOrderCost(ClaimModel claimModel) {
        log.info("주문 비용 등록 데이터 생성---------");
        return null;
    }

    @Override
    public ClaimModel updateOrderClaim(ClaimModel claimModel) {
        log.info("주문 클레임 업데이트 데이터 생성---------");
        return null;
    }

    @Override
    public ClaimModel insertOrderClaim(ClaimModel claimModel) {
        log.info("주문 클레임 등록 데이터 생성---------");
        return null;
    }
}
