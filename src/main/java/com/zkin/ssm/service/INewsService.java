package com.zkin.ssm.service;

import com.zkin.ssm.model.News;
import org.springframework.stereotype.Repository;


public interface INewsService {
    int deleteByPrimaryKey(News news);

    int insert(News news);

    int insertSelective(News news);

    News selectByPrimaryKey(News news);

    int updateByPrimaryKeySelective(News news);

    int updateByPrimaryKey(News news);
}