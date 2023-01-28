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
        Map<String, Object> cartMap = new HashMap<>(3);
        Cart cart1 = new Cart(1, "班俏BANQIAO超火ins潮卫衣女士2020秋季新款韩版宽松慵懒风薄款外套带帽上衣", "http://localhost:8088/images/1.png", 108.00, 1, true);
        Cart cart2 = new Cart(2, "嘉叶希连帽卫衣女春秋薄款2020新款宽松bf韩版字母印花中长款外套ins潮", "http://localhost:8088/images/2.png", 129.00, 1, true);
        List<Cart> cartList = new ArrayList<>();
        cartList.add(cart1);
        cartList.add(cart2);
        cartMap.put("status", 200);
        cartMap.put("message", "获取购物车列表数据成功！");
        cartMap.put("list", cartList);
        return cartMap;
    }
}
