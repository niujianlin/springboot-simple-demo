package com.example.springboothello.controller;

import com.example.springboothello.entity.Cart;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class GoodsController {
    @RequestMapping("/cart")
    public Map<String, Object> getCart(){

        Cart cart1 = new Cart(1, "班俏BANQIAO超火ins潮卫衣女士2020秋季新款韩版宽松慵懒风薄款外套带帽上衣", "http://localhost:8088/images/1.png", 108.00, 1, true);
        Cart cart2 = new Cart(2, "嘉叶希连帽卫衣女春秋薄款2020新款宽松bf韩版字母印花中长款外套ins潮", "http://localhost:8088/images/2.png", 129.00, 1, true);
        Cart cart3 = new Cart(3, "思蜜怡2020休闲运动套装女春秋季新款时尚大码宽松长袖卫衣两件套", "http://localhost:8088/images/3.png", 198.00, 1, false);
        Cart cart4 = new Cart(4, "思蜜怡卫衣女加绒加厚2020秋冬装新款韩版宽松上衣连帽中长款外套", "http://localhost:8088/images/4.png", 99.00, 1, false);
        Cart cart5 = new Cart(5, "幂凝早秋季卫衣女春秋装韩版宽松中长款假两件上衣薄款ins盐系外套潮", "http://localhost:8088/images/5.png", 156.00, 1, true);
        Cart cart6 = new Cart(6, "ME&CITY女装冬季新款针织抽绳休闲连帽卫衣女", "http://localhost:8088/images/6.png", 142.80, 1, true);
        Cart cart7 = new Cart(7, "幂凝假两件女士卫衣秋冬女装2020年新款韩版宽松春秋季薄款ins潮外套", "http://localhost:8088/images/7.png", 219.00, 2, true);
        Cart cart8 = new Cart(8, "依魅人2020休闲运动衣套装女秋季新款秋季韩版宽松卫衣 时尚两件套", "http://localhost:8088/images/8.png", 178.00, 1, true);
        Cart cart9 = new Cart(9, "芷臻(zhizhen)加厚卫衣2020春秋季女长袖韩版宽松短款加绒春秋装连帽开衫外套冬", "http://localhost:8088/images/9.png", 128.00, 1, false);
        Cart cart10 = new Cart(10, "Semir森马卫衣女冬装2019新款可爱甜美大撞色小清新连帽薄绒女士套头衫", "http://localhost:8088/images/10.png", 153.00, 1, false);

        Map<String, Object> cartMap = new HashMap<>(3);

        List<Cart> cartList = new ArrayList<>();
        cartList.add(cart1);
        cartList.add(cart2);
        cartList.add(cart3);
        cartList.add(cart4);
        cartList.add(cart5);
        cartList.add(cart6);
        cartList.add(cart7);
        cartList.add(cart8);
        cartList.add(cart9);
        cartList.add(cart10);
        cartMap.put("status", 200);
        cartMap.put("message", "获取购物车列表数据成功！");
        cartMap.put("list", cartList);
        return cartMap;
    }
}
