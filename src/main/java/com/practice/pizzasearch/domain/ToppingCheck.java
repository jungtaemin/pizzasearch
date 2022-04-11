package com.practice.pizzasearch.domain;

//체크박스 저장클래스

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ToppingCheck {
    private boolean peperoni;
    private boolean shrimp;
    private boolean meat;
    private boolean pineapple;
    private boolean potato;
    private boolean sweetpotato;

    public ToppingCheck(boolean peperoni, boolean shrimp, boolean meat, boolean pineapple, boolean potato, boolean sweetpotato) {
        this.peperoni = peperoni;
        this.shrimp = shrimp;
        this.meat = meat;
        this.pineapple = pineapple;
        this.potato = potato;
        this.sweetpotato = sweetpotato;
    }

    public ToppingCheck() {
    }
    // 토핑 이미지 가져오기
    public String getMeatImg() {

    return "고기.png";
    }
    public String getPeperoniImg() {

        return "페페로니.png";
    }
    public String getShrimpImg() {

        return "새우.png";
    }
    public String getPineappleImg() {

        return "파인애플.png";
    }
    public String getPotatoImg() {

        return "감자.png";
    }
    public String getSweetpotatoImg() {

        return "고구마.png";
    }
}
