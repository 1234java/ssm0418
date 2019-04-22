package com.zkin.ssm.service;

import com.zkin.ssm.model.Customer;
import com.zkin.ssm.utils.PageBean;

import java.util.List;


public interface ICustomerService {
    int deleteByPrimaryKey(Customer customer);

    int insert(Customer customer);
    int insertSelective(Customer customer);

    Customer selectByPrimaryKey(Customer customer);

    int updateByPrimaryKeySelective(Customer customer);

    int updateByPrimaryKey(Customer customer);


    List<Customer> listCustomer(Customer Customer, PageBean pageBean);
}