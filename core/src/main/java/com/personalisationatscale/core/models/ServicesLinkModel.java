package com.personalisationatscale.core.models;

import javax.annotation.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServicesLinkModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String path;

    @ValueMapValue
    private String buttontext;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getPath() {
        return path;
    }

    public String getButtonText() {
        return buttontext;
    }
}