package com.practice.pizzasearch.domain.mappers;

import com.practice.pizzasearch.domain.ToppingCnt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CntRepository {

    @Select("select * from toppingcnt")
    public List<ToppingCnt> getRepository();
}
