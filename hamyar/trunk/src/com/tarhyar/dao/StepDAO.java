package com.tarhyar.dao;

import com.tarhyar.hibernate.persistence.HibernateUtil;
import com.tarhyar.hibernate.exceptions.InfrastructureException;
import com.tarhyar.model.Step;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Oct 5, 2005
 * Time: 5:59:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class StepDAO {

    public StepDAO() {
             HibernateUtil.beginTransaction();
       }

    public List getSubs(String stepId) {
          Session session = HibernateUtil.getSession();
        List <Step> steps;
        try {
            steps = session.createCriteria(Step.class).
                            add(Restrictions.eq("",stepId)).list();
            return steps;
        } catch( HibernateException ex) {
                throw new InfrastructureException(ex);
           }
    }
}
