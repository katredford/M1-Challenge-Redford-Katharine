package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

     Customer customer;
     Address shippingAddress;
     Address billingAddress;

    @Before
    public void setUp() throws Exception {
        shippingAddress = new Address();
        billingAddress = new Address();
        customer = new Customer();



        shippingAddress.setCity("cuduhay");
        shippingAddress.setState("nebraska");
        shippingAddress.setStreet1("clark st");
        shippingAddress.setStreet2("clark street returns");
        shippingAddress.setZipcode("23451");

        billingAddress.setCity("cuduhay");
        billingAddress.setState("nebraska");
        billingAddress.setStreet1("clark st");
        billingAddress.setStreet2("clark street returns");
        billingAddress.setZipcode("23451");

        customer.setFirstName("linda");
        customer.setLastName("bradley");
        customer.setEmail("test@testmail.com");
        customer.setPhoneNumber("235012347");
        customer.setRewardsMember(true);
        customer.setShippingAddress(shippingAddress);
        customer.setBillingAddress(billingAddress);


    }

    @Test
    public void getCustomer(){

        assertEquals("linda", customer.getFirstName());
        assertEquals("bradley", customer.getLastName());
        assertEquals("test@testmail.com", customer.getEmail());
        assertEquals("235012347", customer.getPhoneNumber());
        assertEquals(true, customer.isRewardsMember());
    }

    @Test
    public void testingAddress(){
        assertEquals("nebraska", customer.getBillingAddress().getState());
        assertEquals("clark st", customer.getBillingAddress().getStreet1());

        assertEquals("nebraska", customer.getShippingAddress().getState());
        assertEquals("clark st", customer.getShippingAddress().getStreet1());


    }

}