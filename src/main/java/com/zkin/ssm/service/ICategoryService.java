package com.zkin.ssm.service;

import com.zkin.ssm.model.Category;
import org.springframework.stereotype.Repository;

public interface ICategoryService {
    int deleteByPrimaryKey(Category category);

    int insert(Category category);

    int insertSelective(Category category);

    Category selectByPrimaryKey(Category category);

    int updateByPrimaryKeySelective(Category category);

    int updateByPrimaryKey(Category category);
}