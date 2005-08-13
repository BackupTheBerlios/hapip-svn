package com.tarhyar.model;

import java.util.Set;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 12:26:28 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract  class Step {

    private long id;
    private String discriminator;
    private String name;
    private String nickname;
    private boolean isSummery;
    private Date startDate;
    private Date endDate;
    private Resource primaryResource;


    private Set<Step> subs;
    private Set<Step> predecessors;
    private float budget;


    public Step(){}

    public abstract String getDiscriminator();

    public void setDiscriminator(String d) { discriminator = d;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isSummery() {
        return isSummery;
    }

    public void setSummery(boolean summery) {
        isSummery = summery;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Resource getPrimaryResource() {
        return primaryResource;
    }

    public void setPrimaryResource(Resource primaryResource) {
        this.primaryResource = primaryResource;
    }

    public Set<Step> getSubs() {
        return subs;
    }

    public void setSubs(Set<Step> subs) {
        this.subs = subs;
    }

    public Set<Step> getPredecessors() {
        return predecessors;
    }

    public void setPredecessors(Set<Step> predecessors) {
        this.predecessors = predecessors;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }


}
