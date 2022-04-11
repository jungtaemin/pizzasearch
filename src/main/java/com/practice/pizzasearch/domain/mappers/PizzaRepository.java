package com.practice.pizzasearch.domain.mappers;

import com.practice.pizzasearch.domain.Pizza;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * @insert 만 쓸예정
 *
 *
 */
@Mapper
public interface PizzaRepository {

    // 모두 가져오기 혹시몰라서 ㅎㅎ;
    @Select("select *from pizza")
    public List<Pizza> findAll();



    //토핑 고기만 가져오기
    @Select("select * from pizza where topping like '%고기%' order by id")
    public List<Pizza> findMeat();

    //페페로니만 가져오기
    @Select("select * from pizza where topping like '%페페로니%' order by id")
    public List<Pizza> findPeperoni();


    //새우만 가져오기
    @Select("select * from pizza where topping like '%새우%' order by id")
    public List<Pizza> findShrimp();


    //파인애플만 가져오기
    @Select("select * from pizza where topping like '%파인애플%' order by id")
    public List<Pizza> findPineapple();


    // 감자만 가져오기
    @Select("select * from pizza where topping like '%감자%' order by id")
    public List<Pizza> findPotato();


    //고구마만 가져오기
    @Select("select * from pizza where topping like '%고구마%' order by id")
    public List<Pizza> findSweetpotato();

}
