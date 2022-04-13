package com.practice.pizzasearch.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
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
    private Integer rank;           // 순위용 rownum담을 field


    //--           생성자

    public Pizza() {
    }

    public Pizza(String name, Integer id, String content, String topping, Integer good, Integer bad, String price, String company, String image, Integer rank) {
        this.name = name;
        this.id = id;
        this.content = content;
        this.topping = topping;
        this.good = good;
        this.bad = bad;
        this.price = price;
        this.company = company;
        this.image = image;
        this.rank = rank;
    }

    // 좋아요 cnt++
//    public void goodCnt(){
//        this.good += good++;
//    }
//
//    public void badCnt(){
//        this.bad += bad++;
//    }

}
