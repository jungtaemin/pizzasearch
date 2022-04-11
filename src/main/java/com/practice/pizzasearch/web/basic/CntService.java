package com.practice.pizzasearch.web.basic;

import com.practice.pizzasearch.domain.ToppingCnt;
import com.practice.pizzasearch.domain.mappers.CntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  private Integer peperoni;
 *     private Integer shrimp;
 *     private Integer meat;
 *     private Integer pineapple;
 *     private Integer potato;
 *     private Integer sweetpotato;
 */
@Service
public class CntService {

    private Integer cnt_peperoni;
    private Integer cnt_shrimp;
    private Integer cnt_meat;
    private Integer cnt_pineapple;
    private Integer cnt_potato;
    private Integer cnt_sweetpotato;
    private CntRepository cntRepository;

    @Autowired
    public CntService( CntRepository cntRepository) {

        this.cntRepository = cntRepository;
    }

    public void cntMeat(){
        cnt_meat++;
        cntRepository.updateCntMeat(cnt_meat);
    }
    public void cntPeperoni(){
        cnt_peperoni++;

        cntRepository.updateCntPeperoni(cnt_peperoni);
    }
    public void cntShrimp(){
        cnt_shrimp++;

        cntRepository.updateCntShrimp(cnt_shrimp);
    }
    public void cntPineapple(){
        cnt_pineapple++;

        cntRepository.updateCntPineaplle(cnt_pineapple);
    }
    public void cntPotato(){
        cnt_potato++;

        cntRepository.updateCntPotato(cnt_potato);
    }
    public void cntSweetpotato(){
        cnt_sweetpotato++;

        cntRepository.updateCntSweetpotato(cnt_sweetpotato);
    }
}
