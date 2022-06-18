package com.plateer.ec1.claim.controller;

import com.plateer.ec1.claim.service.ClaimService;
import com.plateer.ec1.claim.vo.ClaimDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;

    public void claim(ClaimDto dto){
        claimService.claim(dto);
    }
}
