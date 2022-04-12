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

    //----------------------------------------------------------------------------------------검색 페이지

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

    
    
    
    //----------------------------------------------------------------------------------------순위 페이지
    //좋아요순으로 가져오기
    @Select("select rownum rank,pizza.* from(select * from pizza order by good desc)pizza")
    public List<Pizza> findGood();
    //싫어요순으로 가져오기
    @Select("select rownum rank,pizza.* from(select * from pizza order by bad desc)pizza")
    public List<Pizza> findbad();

    
    //----------------------------------------------------------------------------------------왼쪽 사이드바 인터페이스용 명령문입니다!(시간부족시 폐기예정)


    //좋아요순 도미노
    @Select("select rownum rank,pizza.* from(select * from pizza where company like '%도미노%' order by good desc)pizza")
    public List<Pizza> findGoodDomino();

    //좋아요순 미스터피자
    @Select("select rownum rank,pizza.* from(select * from pizza  where company like '%미스터%' order by good desc)pizza ")
    public List<Pizza> findGoodMipi();
    //싫어요순 도미노
    @Select("select rownum rank,pizza.* from(select * from pizza where company like '%도미노%' order by bad desc)pizza")
    public List<Pizza> findbadDomino();
    //싫어요순 미스터피자
    @Select("select rownum rank,pizza.* from(select * from where company like '%미스터%' pizza order by bad desc)pizza")
    public List<Pizza> findbadMipi();
    

}
