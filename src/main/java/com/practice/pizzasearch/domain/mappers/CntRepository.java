package com.practice.pizzasearch.domain.mappers;

import com.practice.pizzasearch.domain.ToppingCnt;
import com.practice.pizzasearch.web.basic.CntService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @update 만 기능으로 쓸예정
 */
@Mapper
public interface CntRepository {

    // test 용
    @Select("select * from toppingcnt")
    public List<ToppingCnt> getRepository();

    
    // cnt++ 토핑순위용
    @Update("update toppingcnt set meat = #{cntMeat}")
    public int updateCntMeat(Integer cntMeat);

    @Update("update toppingcnt set peperoni = #{cntPeperoni}")
    public int updateCntPeperoni(Integer cntPeperoni);

    @Update("update toppingcnt set potato = #{cntPotato}")
    public int updateCntPotato(Integer cntPotato);

    @Update("update toppingcnt set shrimp = #{cntShrimp}")
    public int updateCntShrimp(Integer cntShrimp);

    @Update("update toppingcnt set pineapple = #{cntPineapple}")
    public int updateCntPineaplle(Integer cntPineapple);

    @Update("update toppingcnt set sweetpotato = #{cntSweetpotato}")
    public int updateCntSweetpotato(Integer cntSweetpotato);
}
