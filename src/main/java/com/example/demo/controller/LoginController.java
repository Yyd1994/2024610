package com.example.demo.controller;

import com.example.demo.bean.UserInfo;
import com.example.demo.bean.informationBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/loginIn")
    public informationBean loginIn(@RequestParam String name, @RequestParam String password){
        //UserBean userBean = userService.loginIn(name,password);
        informationBean userBean = userService.getInfore(name,password);
        if(userBean!=null){
            return userBean;
        }else {
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/getid")
    public UserInfo userId(Integer id) { // 使用实体类对象和接口方法
        if (id == null) {
            System.out.println("id is null");
            return null;
        }
        return userService.userId(id);

    }
}
