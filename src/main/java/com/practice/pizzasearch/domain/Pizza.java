package com.practice.pizzasearch.domain;

import lombok.Data;

@Data
public class Pizza {
    private String name;
    private String topping1;
    private String topping2;
    private Integer price;
    private String content;           // 내용

    public Pizza(String name, String topping1, String topping2, Integer price, String content) {
        this.name = name;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.price = price;
        this.content = content;
    }

    public Pizza() {
    }
}
