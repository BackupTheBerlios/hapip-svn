package com.tarhyar.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
import junit.textui.TestRunner;
import com.tarhyar.dao.ActivityDAO;
import com.tarhyar.dao.ResourceDAO;
import com.tarhyar.model.Activity;
import com.tarhyar.model.Resource;
import com.tarhyar.hibernate.persistence.HibernateUtil;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 21, 2005
 * Time: 1:31:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActivityTest extends TestCase {

    public void testPersistentActivity() throws Exception {
        ActivityDAO actvDAO = new ActivityDAO();
        Activity actv = new Activity();
        actv.setName("test");
        actv.setNickname("sal");
        System.out.println("actv name is "+ actv.getName());
        ResourceDAO rDAO = new ResourceDAO();
        Resource r =new Resource();
        r = rDAO.getResourceById(2L,false);
        System.out.println("r name is " + r.getName());
        actvDAO.makePrsistent(actv);
        actv.addResource(r);

        HibernateUtil.commitTransaction();
    }

    public ActivityTest( String x) {
        super(x);
    }

    public static Test suite() {
        return new TestSuite(ActivityTest.class);
    }

    public static void main(String[] args) throws Exception{
        TestRunner.run(suite());
    }
}
