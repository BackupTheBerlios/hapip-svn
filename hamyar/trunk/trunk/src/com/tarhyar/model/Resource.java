package com.tarhyar.model;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 12:37:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Resource {
    private long id;
    private String type;
    private String name;
    private float available;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
