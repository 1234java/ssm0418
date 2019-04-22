package com.zkin.ssm.service.impl;

import com.zkin.ssm.model.Category;
import com.zkin.ssm.service.ICategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CategoryServiceImplTest extends BaseTestCase {
@Autowired
    private ICategoryService iCategoryService;
    private Category category;

    @Override
    public void before() {
        super.before();
        category =new Category();
    }

    @Test
    public void selectByPrimaryKey() {
        category.setCategoryId(1);
        Category category = iCategoryService.selectByPrimaryKey(this.category);
        System.out.println(category);
    }
}