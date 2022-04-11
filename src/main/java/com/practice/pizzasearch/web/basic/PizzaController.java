package com.practice.pizzasearch.web.basic;


import com.practice.pizzasearch.domain.Pizza;
import com.practice.pizzasearch.domain.ToppingCheck;
import com.practice.pizzasearch.domain.ToppingCnt;
import com.practice.pizzasearch.domain.mappers.CntRepository;
import com.practice.pizzasearch.domain.mappers.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pizza")
public class PizzaController {

    private CntRepository cntRepository;
    private PizzaRepository pizzaRepository;

    private CntService cntService;


    @Autowired
    public PizzaController(PizzaRepository pizzaRepository ,CntRepository cntRepository,CntService cntService)  {
        this.pizzaRepository = pizzaRepository;
        this.cntRepository = cntRepository;
        this.cntService = cntService;
    }
    @GetMapping("/")
    public String indexGo(Model model){
        List<ToppingCnt> toppingCnt = cntRepository.getRepository();
        model.addAttribute("toppingCnt",toppingCnt);
        return "index.html";
    }


    //  db연결 테스트용
    @GetMapping("/test")
    public String test(Model model) {
        List<ToppingCnt> toppingCnt = cntRepository.getRepository();
        model.addAttribute("toppingCnt", toppingCnt);
        return "/pizza/test";
    }


    // ----------------------------------------------------------------------------------------체크박스 >버튼 클릭시 여기로
    @PostMapping("/check")
    public String check(@RequestParam("checked") List<String> checked  , Model model ) {


        Map<Integer, Pizza> pizzas = new HashMap<>();




        //  -------------------------------------- 고기일경우
        if (checked.contains("1")) {
            //cntService.cntMeat();
            List<Pizza> pizza1 = pizzaRepository.findMeat();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }

        //  -------------------------------------- 페페로니일경우
        if (checked.contains("2")) {
            //cntService.cntPeperoni();
            List<Pizza> pizza1 = pizzaRepository.findPeperoni();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }
        //  -------------------------------------- 감자일경우
        if (checked.contains("3")) {
           // cntService.cntPotato();
            List<Pizza> pizza1 = pizzaRepository.findPotato();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }
        //  -------------------------------------- 파인애플일경우
        if (checked.contains("4")) {
            //cntService.cntPineapple();
            List<Pizza> pizza1 = pizzaRepository.findPineapple();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }
        //  -------------------------------------- 새우일경우
        if (checked.contains("5")) {
            //cntService.cntShrimp();
            List<Pizza> pizza1 = pizzaRepository.findShrimp();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }
        //  -------------------------------------- 고구마일경우
        if (checked.contains("6")) {
            //cntService.cntSweetpotato();
            List<Pizza> pizza1 = pizzaRepository.findSweetpotato();

            for (Pizza pizza2 : pizza1) {
                pizzas.put(pizza2.getId(), pizza2);
            }
        }
        List<Pizza> pizza3 = new ArrayList<>();
        for (Integer key : pizzas.keySet()){
             pizza3.add(pizzas.get(key));
        }
      
        //  -------------------------------------------------------체크 2개시 공통된거만 화면에 출력하는 로직  1:고기 2:페페로니 3:감자 4:파인애플 5:새우 6:고구마
        if(checked.size()>1) {
            List<Pizza> empty = new ArrayList<>();
            List<Pizza> trash = new ArrayList<>();

            for (Pizza pizzaDouble : pizza3) {
                String topping = pizzaDouble.getTopping();
                if (checked.contains("1") && checked.contains("2")) {
                    if (topping.matches(".*고기.*") && topping.matches(".*페페로니.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("1") && checked.contains("3")) {
                    if (topping.matches(".*고기.*") && topping.matches(".*감자.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("1") && checked.contains("4")) {
                    if (topping.matches(".*고기.*") && topping.matches(".*파인애플.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("1") && checked.contains("5")) {
                    if (topping.matches(".*고기.*") && topping.matches(".*새우.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("1") && checked.contains("6")) {
                    if (topping.matches(".*고기.*") && topping.matches(".*고구마.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("2") && checked.contains("3")) {
                    if (topping.matches(".*페페로니.*") && topping.matches(".*감자.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("2") && checked.contains("4")) {
                    if (topping.matches(".*페페로니.*") && topping.matches(".*파인애플.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("2") && checked.contains("5")) {
                    if (topping.matches(".*페페로니.*") && topping.matches(".*새우.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("2") && checked.contains("6")) {
                    if (topping.matches(".*페페로니.*") && topping.matches(".*고구마.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("3") && checked.contains("4")) {
                    if (topping.matches(".*감자.*") && topping.matches(".*파인애플.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }


                if (checked.contains("3") && checked.contains("5")) {
                    if (topping.matches(".*감자.*") && topping.matches(".*새우.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }


                if (checked.contains("3") && checked.contains("6")) {
                    if (topping.matches(".*감자.*") && topping.matches(".*고구마.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("4") && checked.contains("5")) {
                    if (topping.matches(".*파인애플.*") && topping.matches(".*새우.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }

                if (checked.contains("4") && checked.contains("6")) {
                    if (topping.matches(".*파인애플.*") && topping.matches(".*고구마.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }


                if (checked.contains("5") && checked.contains("6")) {
                    if (topping.matches(".*새우.*") && topping.matches(".*고구마.*")) {
                        empty.add(pizzaDouble);

                    } else trash.add(pizzaDouble);

                }








            }
            trash.clear();
            pizza3.clear();
            for (Pizza zz : empty) {
                pizza3.add(zz);
            }

        }

        model.addAttribute("pizza3", pizza3);
//        List<ToppingCnt> toppingCnt = cntRepository.getRepository();
//        model.addAttribute("toppingCnt", toppingCnt);

        // 이미지도 model에 넣기
        List<String> pickImage = new ArrayList<>();
        if(checked.contains("2"))
            pickImage.add("페페로니.png");
        if(checked.contains("3"))
            pickImage.add("감자.png");
        if(checked.contains("6"))
            pickImage.add("고구마.png");
        if(checked.contains("1"))
            pickImage.add("고기.png");
        if(checked.contains("5"))
            pickImage.add("새우.png");
        if(checked.contains("4"))
            pickImage.add("파인애플.png");
        
        model.addAttribute("pickImage",pickImage);
        return "/pizza/search";


}

}