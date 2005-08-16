package com.tarhyar.dao;

import com.tarhyar.hibernate.persistence.HibernateUtil;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Project;
import org.hibernate.Session;
import org.hibernate.LockMode;
import org.hibernate.HibernateException;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 15, 2005
 * Time: 3:12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProjectDAO {

    public ProjectDAO() {
          HibernateUtil.beginTransaction();
    }

    public Project getProjectById(Long projectId, boolean lock) throws InfrastructureException {
        Session session = HibernateUtil.getSession();
        Project project = null;
        try {
            if (lock) {
                project = (Project) session.load(Project.class, projectId, LockMode.UPGRADE);
            } else {
                project = (Project) session.load(Project.class, projectId);
            }
        }catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return project;
    }

    public Collection findAll()  throws InfrastructureException{
        Session session = HibernateUtil.getSession();
        Collection projects;
        try {
            projects = session.createCriteria(Project.class).list();

        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return projects;
    }

    public void makePrsistent (Project project ) throws InfrastructureException {
        try {
            HibernateUtil.getSession().saveOrUpdate(project);
        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }
}
