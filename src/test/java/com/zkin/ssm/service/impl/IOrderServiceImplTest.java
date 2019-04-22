package com.zkin.ssm.service.impl;

import com.zkin.ssm.model.Order;
import com.zkin.ssm.service.IOrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class IOrderServiceImplTest extends BaseTestCase {

    @Autowired
    private  IOrderService orderService;

    private  Order order;
    @Override
    public void before() {
        super.before();
        order=new Order();
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        order.setOrderId(1);
        Order order = orderService.selectByPrimaryKey(this.order);
        System.out.println(order);
    }
}