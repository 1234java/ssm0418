package com.zkin.ssm.service.impl;

import com.zkin.ssm.mapper.OrderMapper;
import com.zkin.ssm.model.Order;
import com.zkin.ssm.service.IOrderService;
import com.zkin.ssm.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public int deleteByPrimaryKey(Order order) {
        return orderMapper.deleteByPrimaryKey(order.getOrderId());
    }

    @Override
    public int insert(Order order)
    {
        return orderMapper.insert(order);
    }

    @Override
    public int insertSelective(Order order) {

        return orderMapper.insertSelective(order);
    }

    @Override
    public Order selectByPrimaryKey(Order order)
    {
        return orderMapper.selectByPrimaryKey(order.getOrderId());
    }

    @Override
    public int updateByPrimaryKeySelective(Order order) {

        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public int updateByPrimaryKey(Order order) {

        return orderMapper.updateByPrimaryKey(order);
    }

    @Override
    public List<Order> listOrder(Order order, PageBean pageBean) {

        return orderMapper.list(order);
    }
}
