package com.tarhyar.model;

import com.tarhyar.dao.ProjectDAO;

import javax.faces.model.SelectItem;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 11, 2005
 * Time: 3:03:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Project  extends Step{
    private static Log log = LogFactory.getLog(Project.class);
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

     public String save() {
        try {
            ProjectDAO pdao = new ProjectDAO();
            pdao.makePrsistent(this);
        return ("success");
        } catch(Throwable th) {
            return ("error");
        }
     }
}
