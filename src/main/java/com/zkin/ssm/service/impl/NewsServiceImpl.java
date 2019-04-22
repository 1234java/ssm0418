package com.zkin.ssm.service.impl;

import com.zkin.ssm.mapper.NewsMapper;
import com.zkin.ssm.model.News;
import com.zkin.ssm.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;


    @Override
    public int deleteByPrimaryKey(News news) {
        return 0;
    }

    @Override
    public int insert(News news) {
        return 0;
    }

    @Override
    public int insertSelective(News news) {
        return 0;
    }

    @Override
    public News selectByPrimaryKey(News news) {
        return newsMapper.selectByPrimaryKey(news.getNewsId());
    }

    @Override
    public int updateByPrimaryKeySelective(News news) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(News news) {
        return 0;
    }
}
