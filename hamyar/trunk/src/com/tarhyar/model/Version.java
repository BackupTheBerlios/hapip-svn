package com.tarhyar.model;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 30, 2005
 * Time: 2:00:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Version {

    private String name ;
    private String url;
    private String branchId;
    private long docId;
    private Version parentVersion;
    private long id;
    private Set<Version> childVersions;

    public Version() {
        childVersions =  new  HashSet<Version>();
        parentVersion = null;
    }

    public Version(String name, String url, long docId,String branchId) {
        this.name = name;
        this.url = url;
        this.docId = docId;
        this.branchId = branchId;
    }

    public boolean equals(Version obj) {
        if (obj.name.equals(name) && obj.getUrl().equals(url) && obj.getDocId()==docId)
            return true;
        else
            return false;
    }

    public String getBranchFullId() {
        if (this.parentVersion ==null)
            return "";
        else
            return this.getBranchId()+"."+this.getParentVersion().getBranchFullId();
    }


    //***************************************

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Version> getChildVersions() {
        return childVersions;
    }

    public void setChildVersions(Set<Version> childVersions) {
        this.childVersions = childVersions;
    }

    public Version getParentVersion() {
        return parentVersion;
    }

    public void setParentVersion(Version parentVersion) {
        this.parentVersion = parentVersion;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
    }
}
