package com.plateer.ec1.claim.vo;

import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.type.ProcessorType;
import lombok.Data;

@Data
public class ClaimDto {
    private String claimNo;
    private ClaimType claimType;
}
