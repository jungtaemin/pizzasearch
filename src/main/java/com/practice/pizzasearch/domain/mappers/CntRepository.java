package com.practice.pizzasearch.domain.mappers;

import com.practice.pizzasearch.domain.ToppingCnt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @update 만 기능으로 쓸예정
 */
@Mapper
public interface CntRepository {

    // test 용
    @Select("select * from toppingcnt")
    public List<ToppingCnt> getRepository();


}
