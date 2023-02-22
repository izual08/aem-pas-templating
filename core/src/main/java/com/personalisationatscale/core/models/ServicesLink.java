package com.personalisationatscale.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class ServicesLink {

    @Inject
    private List<ServicesLinkModel> servicesInfo;

    public List<ServicesLinkModel> getServicesInfo() {
        return new ArrayList<>(servicesInfo);
    }

}