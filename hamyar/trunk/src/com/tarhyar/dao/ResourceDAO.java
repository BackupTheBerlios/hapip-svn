/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 21, 2005
 * Time: 2:42:37 PM
 * To change this template use File | Settings | File Templates.
 */

package com.tarhyar.dao;

import com.tarhyar.hibernate.persistence.HibernateUtil;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Resource;
import org.hibernate.Session;
import org.hibernate.LockMode;
import org.hibernate.HibernateException;

import java.util.Collection;
import java.util.Set;
import java.io.Serializable;

/**
 * User: as
 * Date: Aug 21, 2005
 * Time: 1:35:08 PM
 */

public class ResourceDAO {

    public ResourceDAO() {
        HibernateUtil.beginTransaction();
    }

    public Resource getResourceById(Long id, boolean lock) throws InfrastructureException {
        Session session = HibernateUtil.getSession();
        Resource obj = null;
        try {
            if (lock) {
                obj = (Resource) session.load(Resource.class, id, LockMode.UPGRADE);
            } else {
                obj = (Resource) session.load(Resource.class, id);
            }
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return obj;
    }

    public Collection findAll() throws InfrastructureException {
        Session session = HibernateUtil.getSession();
        Collection objs;
        try {
            objs = session.createCriteria(Resource.class).list();

        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return objs;
    }

    public void makePrsistent(Resource obj) throws InfrastructureException {
        try {
            HibernateUtil.getSession().saveOrUpdate(obj);
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }

    public Long  save(Resource obj) {
        try {
        return (Long) HibernateUtil.getSession().save(obj);
        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }

    public Set<Resource>getByName(String name) {
        return null;
    }



}
