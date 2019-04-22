package com.zkin.ssm.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@ToString
public class Category implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private List<News>  news;

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}