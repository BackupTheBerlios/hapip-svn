package com.tarhyar.model;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 3:03:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Project  extends Step{

    private   Person manager;

    public String getDiscriminator() {
        return "PROJECT";
    }


    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }


}