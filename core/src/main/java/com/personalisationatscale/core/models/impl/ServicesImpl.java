package com.personalisationatscale.core.models.impl;

import com.personalisationatscale.core.models.Services;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.*;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = Services.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ServicesImpl implements Services {

    @ValueMapValue
    private List<String> serviceinfo;

    @Override
    public List<String> getServiceInfo() {
        if(serviceinfo!=null){
            return new ArrayList<String>(serviceinfo);
        }else{
            return Collections.emptyList();
        }
    }

}
