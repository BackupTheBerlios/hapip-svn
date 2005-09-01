package com.tarhyar.test;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;
import com.tarhyar.dao.ResourceDAO;
import com.tarhyar.model.Resource;
import com.tarhyar.hibernate.persistence.HibernateUtil;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 22, 2005
 * Time: 5:25:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceTest extends TestCase {

    public void testPersistance() {
        ResourceDAO dao = new ResourceDAO();
        Resource r = new Resource();
        r.setName("testresource");
        r.setAvailable(1.2F);
        dao.makePrsistent(r);

        HibernateUtil.commitTransaction();
    }
    public void testFech(){

        ResourceDAO dao = new ResourceDAO();
        Resource r = dao.getResourceById(1L,false);
        assertEquals(r.getName(),"testresource");
        assertEquals(r.getAvailable(),1.2F);
        HibernateUtil.commitTransaction();
    }

    public ResourceTest(String string) {
        super(string);
    }
     public static Test suite() {
         return new TestSuite(ResourceTest.class);
     }
}
