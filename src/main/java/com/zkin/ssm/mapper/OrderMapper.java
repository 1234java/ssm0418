package com.zkin.ssm.mapper;

import com.zkin.ssm.model.Order;
import com.zkin.ssm.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> list(Order record);


}