package com.tarhyar.dao;

import com.tarhyar.hibernate.persistence.HibernateUtil;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Activity;

import org.hibernate.Session;
import org.hibernate.LockMode;
import org.hibernate.HibernateException;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 21, 2005
 * Time: 1:35:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActivityDAO {

  public  ActivityDAO(){
      HibernateUtil.beginTransaction();
  }

    public Activity getActivityById(Long activityId, boolean lock) throws InfrastructureException {
            Session session = HibernateUtil.getSession();
            Activity activity = null;
            try {
                if (lock) {
                    activity = (Activity) session.load(Activity.class, activityId, LockMode.UPGRADE);
                } else {
                    activity = (Activity) session.load(Activity.class, activityId);
                }
            }catch(HibernateException ex) {
                throw new InfrastructureException(ex);
            }
            return activity;
        }

    public void makePrsistent (Activity obj ) throws InfrastructureException {
        try {
            HibernateUtil.getSession().saveOrUpdate(obj);
            System.out.println("saved successfully!!");
        } catch(HibernateException ex) {
            throw new InfrastructureException(ex);
        }
    }


}
