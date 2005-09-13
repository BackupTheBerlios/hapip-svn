package com.tarhyar.model;

import com.tarhyar.dao.PersonDAO;

import javax.faces.model.SelectItem;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Sep 5, 2005
 * Time: 11:38:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Person{
    private static Log log = LogFactory.getLog(Manager.class);
    private static String discriminator="MANAGER";
    private Set skils;
    private ArrayList<SelectItem> managers= new ArrayList<SelectItem>();

    public Manager() {
    }

    public static String getDiscriminator() {
        return discriminator;
    }

    public Set getSkils() {
        return skils;
    }

    public void setSkils(Set skils) {
        this.skils = skils;
    }

    public ArrayList<SelectItem> getManagers(){
        log.info("in the get managers!!");
        if (managers!=null && managers.size()!=0) {
            log.debug("managers size is "+ managers.size());
            return managers;
        } else {
            refreshManagers();
            log.debug("2-managers size is "+ managers.size());
            return managers;
        }
    }

    private void refreshManagers() {
        PersonDAO pdao = new PersonDAO();
        Collection <Manager>ms=pdao.findManagers();

        managers = new  ArrayList<SelectItem>();
        SelectItem s = new SelectItem("0","nothing");
        managers.add(s);

        for(Manager m: ms) {
            SelectItem si = new SelectItem(m.getId(),m.getLastname() + "-"+ m.getFirstname());
            managers.add(si);
        }
        log.info("arraysize is :"+managers.size());

    }
}
