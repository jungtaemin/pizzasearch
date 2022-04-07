package com.practice.pizzasearch.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ToppingCnt {
    private Integer peperoni;
    private Integer shrimp;
    private Integer meat;
    private Integer pineapple;
    private Integer potato;

    public ToppingCnt() {
    }

    public ToppingCnt(Integer peperoni, Integer shrimp, Integer meat, Integer pineapple, Integer potato) {
        this.peperoni = peperoni;
        this.shrimp = shrimp;
        this.meat = meat;
        this.pineapple = pineapple;
        this.potato = potato;
    }
}
