package com.zkin.ssm.service.impl;

import com.zkin.ssm.mapper.CategoryMapper;
import com.zkin.ssm.model.Category;
import com.zkin.ssm.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int deleteByPrimaryKey(Category category) {
        return 0;
    }

    @Override
    public int insert(Category category) {
        return 0;
    }

    @Override
    public int insertSelective(Category category) {
        return 0;
    }

    @Override
    public Category selectByPrimaryKey(Category category) {
        return categoryMapper.selectByPrimaryKey(category.getCategoryId());
    }

    @Override
    public int updateByPrimaryKeySelective(Category category) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Category category) {
        return 0;
    }
}
