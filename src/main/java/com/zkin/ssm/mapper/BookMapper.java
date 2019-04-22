package com.zkin.ssm.mapper;

import com.zkin.ssm.model.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface BookMapper {
    int deleteByPrimaryKey(Integer rm);

    int insert(Book record);
    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer rm);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> list(Book book);
}