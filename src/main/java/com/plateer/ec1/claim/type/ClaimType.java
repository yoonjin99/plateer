package com.plateer.ec1.claim.type;

import com.plateer.ec1.claim.creator.*;
import com.plateer.ec1.claim.processor.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.processor.CompleteProcessor;
import com.plateer.ec1.order.validator.OrderValidator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public enum ClaimType {
    GCC(CompleteProcessor::getInstance, GeneralOrderCancelDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    MCA(AcceptWithdrawalProcessor::getInstance, ECouponCancelAcceptDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    MCC(CompleteProcessor::getInstance, ECouponCancelCompleteDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    RA(AcceptWithdrawalProcessor::getInstance, ReturnAcceptDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    RC(AcceptWithdrawalProcessor::getInstance, RetrunWithdrawalDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    RW(AcceptWithdrawalProcessor::getInstance, RetrunWithdrawalDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    EA(AcceptWithdrawalProcessor::getInstance, ExchangeAcceptDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList()),
    EW(AcceptWithdrawalProcessor::getInstance, ExchangeWithdrawalDataCreator::new, Arrays.asList(),Arrays.asList(), true, "","",Arrays.asList());

    private Supplier<ClaimProcessor> claimProcessor;
    private Supplier<ClaimDataCreator> claimDataCreator;
    private List<String> validStatusList;
    private List<String> productType;
    private Boolean claimNoFlag;
    private String claimCode;
    private String orderStateCode;
    private List<String> deliveryCode;

    ClaimType(Supplier<ClaimProcessor> claimProcessor, Supplier<ClaimDataCreator> claimDataCreator, List<String> validStatusList, List<String> productType, Boolean claimNoFlag, String claimCode, String orderStateCode, List<String> deliveryCode) {
        this.claimProcessor = claimProcessor;
        this.claimDataCreator = claimDataCreator;
        this.validStatusList = validStatusList;
        this.productType = productType;
        this.claimNoFlag = claimNoFlag;
        this.claimCode = claimCode;
        this.orderStateCode = orderStateCode;
        this.deliveryCode = deliveryCode;
    }

    public static ClaimDataCreator findClaimDataCreator(String type){
        return Arrays.stream(ClaimType.values())
                .filter((t) -> t.name().equals(type))
                .findFirst()
                .map(claimType -> claimType.claimDataCreator.get())
                .orElseThrow(() -> new IllegalArgumentException(""));
    }

    public static ClaimProcessor findClaimProcessor(String type){
        return Arrays.stream(ClaimType.values())
                .filter((t) -> t.name().equals(type))
                .findFirst()
                .map(claimType -> claimType.claimProcessor.get())
                .orElseThrow(() -> new IllegalArgumentException(""));
    }
}
