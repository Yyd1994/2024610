package com.example.demo.service;

import com.example.demo.bean.UserInfo;
import com.example.demo.bean.informationBean;

public interface UserService {
    informationBean getInfore(String name, String password);

    UserInfo userId(Integer id);
}
