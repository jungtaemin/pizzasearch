package com.practice.pizzasearch.web.basic;

import com.practice.pizzasearch.domain.ToppingCnt;
import com.practice.pizzasearch.domain.mappers.CntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pizza")
public class PizzaController {

    private  CntRepository cntRepository;

    @Autowired
    public PizzaController(CntRepository cntRepository) {
        this.cntRepository = cntRepository;
    }

    //  db연결 테스트용
    @GetMapping("/test")
    public String test(Model model){
       List<ToppingCnt> toppingCnt =  cntRepository.getRepository();
        model.addAttribute("toppingCnt",toppingCnt);
        return "/pizza/test";
        }

        @GetMapping("/check")
    public String check(){
        return "/pizza/test";
        }


}
