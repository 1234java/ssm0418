package com.zkin.ssm.service.impl;

import com.zkin.ssm.model.Customer;
import com.zkin.ssm.service.ICustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ICustomerServiceImplTest extends BaseTestCase {

    @Autowired
    private ICustomerService customerService;
    private Customer customer;
    @Override
    public void before() {
        super.before();
        customer =new Customer();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {

    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void listCustomer() {


        List<Customer> customers = customerService.listCustomer(customer, pageBean);
        for (Customer c : customers) {
            System.out.println(c);
        }

    }
}