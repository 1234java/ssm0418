package com.zkin.ssm.service;

import com.zkin.ssm.model.Book;
import com.zkin.ssm.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IBookService {
    int deleteByPrimaryKey(Book book);

    int insert(Book record);
    int insertSelective(Book record);

    Book selectByPrimaryKey(Book book);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);


    List<Book> listBook(Book book, PageBean pageBean);
}