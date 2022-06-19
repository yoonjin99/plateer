package com.plateer.ec1.claim.service;

import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.vo.ClaimDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClaimService {

    private ClaimProcessor claimProcessor;

    public void claim(ClaimDto claimDto){
        log.info("-------------ClaimService claim method 실행--------------" + claimDto.getClaimType().name() + "----" + claimDto);
        claimProcessor = ClaimType.findClaimProcessor(claimDto.getClaimType().name());
        claimProcessor.doProcess(claimDto);
    }
}
