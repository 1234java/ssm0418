package com.zkin.ssm.service.impl;

import com.zkin.ssm.model.News;
import com.zkin.ssm.service.INewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsServiceImplTest extends BaseTestCase {
    @Autowired
    private INewsService service;

    private News news;
    @Override
    public void before() {
        super.before();
        news =new News();
    }

    @Test
    public void selectByPrimaryKey() {
        news.setNewsId(1);
        News news = service.selectByPrimaryKey(this.news);
        System.out.println(news);
    }
}