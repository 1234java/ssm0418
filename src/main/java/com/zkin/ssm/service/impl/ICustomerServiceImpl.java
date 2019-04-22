package com.zkin.ssm.service.impl;

import com.zkin.ssm.mapper.CustomerMapper;
import com.zkin.ssm.model.Customer;
import com.zkin.ssm.service.ICustomerService;
import com.zkin.ssm.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ICustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public int deleteByPrimaryKey(Customer customer) {
        return customerMapper.deleteByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public int insert(Customer customer) {

        return customerMapper.insert(customer);
    }

    @Override
    public int insertSelective(Customer customer) {

        return customerMapper.insertSelective(customer);
    }

    @Override
    public Customer selectByPrimaryKey(Customer customer)
    {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId());
}

    @Override
    public int updateByPrimaryKeySelective(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public int updateByPrimaryKey(Customer customer) {

        return customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public List<Customer> listCustomer(Customer Customer, PageBean pageBean) {
        return customerMapper.list(Customer);
    }
}
