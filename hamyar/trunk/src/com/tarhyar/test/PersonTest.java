package com.tarhyar.test;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

import com.tarhyar.dao.PersonDAO;

import com.tarhyar.model.Person;
import com.tarhyar.hibernate.persistence.HibernateUtil;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 22, 2005
 * Time: 4:24:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonTest extends TestCase {
            PersonDAO dao;
    public PersonTest() {
     dao = new PersonDAO();
    }

    public void testPersistent() throws Exception {

        Person p =new Person();
         p.setFirstname("armita");
        p.setLastname("sheari");
        Long id = dao.save(p);
        dao.makePrsistent(p);
        Person p1=dao.getPersonById(id,false);
        HibernateUtil.commitTransaction();

        assertEquals("Name:",p1.getFirstname(),"armita");
        assertEquals(p1.getLastname(),"sheari");

     }

     public PersonTest( String x) {
         super(x);
     }

     public static Test suite() {
         return new TestSuite(PersonTest.class);
     }

}
