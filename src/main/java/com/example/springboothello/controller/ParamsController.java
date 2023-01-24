package com.example.springboothello.controller;


import com.example.springboothello.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamsController {

    @RequestMapping (value = "/getTest1", method = RequestMethod.GET)
    //@GetMapping("/getTest1")
    public String getTest1() {
        return "GET请求";
    }
    @RequestMapping(value = "/getTest2", method = RequestMethod.GET)
    public String getTest2(String nickname, String phone){
        System.out.println("nickname:"+nickname);
        System.out.println("phone"+phone);
        return "GET请求";
    }
    @RequestMapping(value = "/getTest3", method = RequestMethod.GET)
    // 如果url参数与这里的不一致，用@RequestParam将url的nickname绑定到name(require控制是否必须传参)
    public String getTest3(@RequestParam(value = "nickname",required = false) String name){
        System.out.println("nickname:"+name);
        return "GET请求";
    }
    @RequestMapping(value = "/postTest1",method = RequestMethod.POST)
    public String postTest1(){
        return "post请求";
    }
    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(String username, String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3", method = RequestMethod.POST)
    public String postTest3(User user) {
        System.out.println(user);
        return "post请求";
    }
    @RequestMapping(value = "/postTest4", method = RequestMethod.POST)
    // 接收json数据需要加@RequestBody
    public String postTest4(@RequestBody User user) {
        System.out.println(user);
        return "post请求";
    }

    @GetMapping("/test/**")
    public String test(){
        return "通配符请求";
    }
}
