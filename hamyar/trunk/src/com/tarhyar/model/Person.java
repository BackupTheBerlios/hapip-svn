package com.tarhyar.model;

/**
 * Created by IntelliJ IDEA.
 * User: as
 * Date: Aug 15, 2005
 * Time: 3:08:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private long id;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String address;
    private long city;


    public Person() {
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCity() {
        return city;
    }

    public void setCity(long city) {
        this.city = city;
    }
}
