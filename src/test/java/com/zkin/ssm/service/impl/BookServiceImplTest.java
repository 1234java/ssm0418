package com.zkin.ssm.service.impl;

import com.zkin.ssm.model.Book;
import com.zkin.ssm.service.IBookService;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest extends  BaseTestCase   {
    @Autowired
     private IBookService bookService;
     Book book;

    @After
    public void tearDown() throws Exception {
    }

    @Override
    public void before() {
        super.before();
        book =new Book();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        book.setName("李江涛");
        book.setPrice(50f);
        int i = bookService.insert(book);
        System.out.println(i);

    }

    @Test
    public void selectByPrimaryKey() {
        book.setRm(15);
        Book book = bookService.selectByPrimaryKey(this.book);
        System.out.println(book);
        System.out.println("--------------------");
        Book book1 = bookService.selectByPrimaryKey(this.book);
        System.out.println(book1);

    }

    @Test
    public void list() {
        pageBean.setPage(1);
        pageBean.setRows(5);
        pageBean.setPagination(true);
        List<Book> list = bookService.listBook(book, pageBean);
        for (Book book1 : list) {
            System.out.println(book1);
        }

        System.out.println("-----------------------");
        List<Book> list1 = bookService.listBook(book, pageBean);
        for (Book book1 : list1) {
            System.out.println(book1);
        }
        System.out.println(pageBean);
    }


}