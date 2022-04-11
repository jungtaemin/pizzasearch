package com.practice.pizzasearch.domain;

import lombok.Data;

@Data
public class Pizza {

    // --        field

    private String name;
    private Integer id;
    private String content;             //내용
    private String topping;
    private Integer good;               //좋아요~
    private Integer bad;                //싫어요~
    private String price;
    private String company;           // ex:도미노피자
    private String image;           // 이미지소스



    //--           생성자

    public Pizza() {
    }

    public Pizza(String name, Integer id, String content, String topping, Integer good, Integer bad, String price, String company, String image) {
        this.name = name;
        this.id = id;
        this.content = content;
        this.topping = topping;
        this.good = good;
        this.bad = bad;
        this.price = price;
        this.company = company;
        this.image = image;
    }
}
