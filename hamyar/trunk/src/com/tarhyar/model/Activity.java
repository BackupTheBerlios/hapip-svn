package com.tarhyar.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 1:32:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Activity extends Step {

    Set<Resource> resources;
    
    public Activity(){}

    public String getDiscriminator() {
        return "TASK";
    }


    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }


}
