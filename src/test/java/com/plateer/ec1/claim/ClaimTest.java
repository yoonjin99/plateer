package com.plateer.ec1.claim;

import com.plateer.ec1.claim.service.ClaimService;
import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.type.ProcessorType;
import com.plateer.ec1.claim.vo.ClaimDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClaimTest {

    @Autowired
    private ClaimService claimService;

    @Test
    void gccClaim(){
        ClaimDto dto = new ClaimDto();
        dto.setClaimType(ClaimType.GCC);
        claimService.claim(dto);
    }

    @Test
    void mcaClaim(){
        ClaimDto dto = new ClaimDto();
        dto.setClaimType(ClaimType.MCA);
        claimService.claim(dto);
    }
}
