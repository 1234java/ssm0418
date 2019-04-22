package com.zkin.ssm.mapper;

import com.zkin.ssm.model.News;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}