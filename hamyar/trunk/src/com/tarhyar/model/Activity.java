package com.tarhyar.model;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 1:32:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class    Activity extends Step {

    Set<Resource> resources;

    public Activity(){
        resources = new HashSet<Resource>();
    }

    public String getDiscriminator() {
        return "ACTIVITY";
    }


    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }

    public void addResource ( Resource r) {
        resources.add(r);
    }


}
