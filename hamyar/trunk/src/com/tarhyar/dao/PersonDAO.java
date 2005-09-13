/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 22, 2005
 * Time: 4:25:52 PM
 * To change this template use File | Settings | File Templates.
 */

package com.tarhyar.dao;

import com.tarhyar.hibernate.persistence.HibernateUtil;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Person;
import com.tarhyar.model.Manager;
import org.hibernate.Session;
import org.hibernate.LockMode;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Example;

import java.util.Collection;

/**
 * User: as
 * Date: Aug 21, 2005
 * Time: 1:35:08 PM
 */

public class PersonDAO {

    public PersonDAO() {
        HibernateUtil.beginTransaction();
    }

    public Person getPersonById(Long id, boolean lock) throws InfrastructureException {
        Session session = HibernateUtil.getSession();
        Person obj = null;
        try {
            if (lock) {
                obj = (Person) session.load(Person.class, id, LockMode.UPGRADE);
            } else {
                obj = (Person) session.load(Person.class, id);
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
            objs = session.createCriteria(Person.class).list();

        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return objs;
    }

    public void makePrsistent(Person obj) throws InfrastructureException {
        try {
            HibernateUtil.getSession().saveOrUpdate(obj);
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }


    public Long save(Person p) {
        try {
        return (Long) HibernateUtil.getSession().save(p);
        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }

    public Collection <Manager> findManagers() {
        Session session = HibernateUtil.getSession();
        Collection <Manager> managers;
        try {
            managers = session.createCriteria(Manager.class).list();
        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return managers;
    }

    public Collection<Manager> findManagers(Manager aManager) {
        Session session = HibernateUtil.getSession();
        Collection <Manager> managers;
        try {
            managers = session.createCriteria(Manager.class).
                    add(Example.create(aManager)).list();
       } catch( HibernateException ex) {
            throw new InfrastructureException(ex);
       }
        return managers;
    }

}
