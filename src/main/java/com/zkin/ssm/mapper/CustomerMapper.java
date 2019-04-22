package com.zkin.ssm.mapper;

import com.zkin.ssm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> list(Customer customer);
}