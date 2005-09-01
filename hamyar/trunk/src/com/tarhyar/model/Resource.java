package com.tarhyar.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 12:37:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Resource {
    private long id;
    private String name;
    private float available;
    private Set activities;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getAvailable() {
        return available;
    }

    public void setAvailable(float available) {
        this.available = available;
    }

    public Set getActivities() {
        return activities;
    }

    public void setActivities(Set activities) {
        this.activities = activities;
    }
}
