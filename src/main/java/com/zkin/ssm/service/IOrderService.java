package com.zkin.ssm.service;

import com.zkin.ssm.model.Order;
import com.zkin.ssm.utils.PageBean;

import java.util.List;


public interface IOrderService {
    int deleteByPrimaryKey(Order order);

    int insert(Order order);
    int insertSelective(Order order);

    Order selectByPrimaryKey(Order order);

    int updateByPrimaryKeySelective(Order order);

    int updateByPrimaryKey(Order order);


    List<Order> listOrder(Order order, PageBean pageBean);
}