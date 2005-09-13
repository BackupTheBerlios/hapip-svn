package com.tarhyar.model;

import com.tarhyar.dao.ProjectDAO;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 30, 2005
 * Time: 1:53:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Document {

    private long id;
    private Vector<Version> versions;
    private String name;
    private String description;
    private long projectId;

    public Document() {
    }

    public void addVersion(String name,String url) {
        versions.add(new Version(name,url,this.id,""));
    }
    public void delVersion (String name,String url) {
        versions.remove(new Version(name,url,this.id,""));
    }

    public void deleteAllVersions(){
        for (Version version : versions)
            versions.remove(version);
    }


    //****//

    public Vector<Version> getVersions() {
        return versions;
    }

    public void setVersions(Vector<Version> versions) {
        this.versions = versions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }



}
