/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 30, 2005
 * Time: 4:04:00 PM
 * To change this template use File | Settings | File Templates.
 */

package com.tarhyar.dao;

import static com.tarhyar.hibernate.persistence.HibernateUtil.*;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Version;
import org.hibernate.Session;
import org.hibernate.LockMode;
import org.hibernate.HibernateException;

import java.util.Collection;

/**
 * User: as
 * Date: Aug 21, 2005
 * Time: 1:35:08 PM
 */

public class VersionDAO {

    public VersionDAO() {
        beginTransaction();
    }

    public Version getVersionById(Long id, boolean lock) throws InfrastructureException {
        Session session = getSession();
        Version obj = null;
        try {
            if (lock) {
                obj = (Version) session.load(Version.class, id, LockMode.UPGRADE);
            } else {
                obj = (Version) session.load(Version.class, id);
            }
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return obj;
    }

    public Collection findAll() throws InfrastructureException {
        Session session = getSession();
        Collection objs;
        try {
            objs = session.createCriteria(Version.class).list();

        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
        return objs;
    }

    public void makePrsistent(Version obj) throws InfrastructureException {
        try {
            getSession().saveOrUpdate(obj);
        } catch (HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }


}
