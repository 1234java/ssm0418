package com.zkin.ssm.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ToString
public class Book implements Serializable {

    private Integer rm;

    private String code;

    private String name;

    private Float price;

    private String type;

    private String author;

    public Book(Integer rm, String code, String name, Float price, String type, String author) {
        this.rm = rm;
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;
    }

    public Book() {
        super();
    }

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}