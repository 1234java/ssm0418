package com.zkin.ssm.service.impl;

import com.zkin.ssm.mapper.BookMapper;
import com.zkin.ssm.model.Book;
import com.zkin.ssm.service.IBookService;
import com.zkin.ssm.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements IBookService {
    @Autowired
    //@Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public int deleteByPrimaryKey(Book book) {

        return bookMapper.deleteByPrimaryKey(book.getRm());
    }

    @Override
    public int insert(Book record) {

        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {

        return bookMapper.insertSelective(record);
    }


    @Override
    @Transactional(readOnly =true )
    public Book selectByPrimaryKey(Book book) {

        return bookMapper.selectByPrimaryKey(book.getRm());
    }

    @Override
    public int updateByPrimaryKeySelective(Book record)
    {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {

        return bookMapper.updateByPrimaryKey(record);

    }

    @Override
    public List<Book> listBook(Book book, PageBean pageBean) {


        return bookMapper.list(book);


    }
}
