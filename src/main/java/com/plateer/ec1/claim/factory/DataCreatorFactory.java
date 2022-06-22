package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.type.ProcessorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class DataCreatorFactory {
    private final Map<ClaimType, ClaimDataCreator> map = new HashMap<>();

    public DataCreatorFactory(List<ClaimDataCreator> claimDataCreators) {
        claimDataCreators.forEach(claimDataCreator -> map.put(claimDataCreator.getType(), claimDataCreator));
    }

    public ClaimDataCreator getClaimDataCreator(ClaimType type){
        return map.get(type);
    }
}
