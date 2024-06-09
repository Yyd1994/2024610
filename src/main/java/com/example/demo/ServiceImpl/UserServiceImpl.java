package com.example.demo.ServiceImpl;

import com.example.demo.bean.UserInfo;
import com.example.demo.bean.informationBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.nameMapper;
import com.example.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@MapperScan
@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层

    @Autowired
    private nameMapper a;

    public informationBean getInfore(String name, String password){
        System.out.println("userMapper.userId(id)");
        informationBean res = a.getInfo(name,password);

        if(res == null){
            System.out.println("userMapper.userId(id) is null");
            return null;
        }
        System.out.println("userMapper.userId(id)"+res.getId());
        return a.getInfo(name,password);
    }


    @Autowired
    private UserMapper userMapper;

    public UserInfo userId(Integer id){ // 此处UserInfo为实体类对象，userId 为数据持久层接口方法
        System.out.println("public UserInfo userId(Integer id)");
        UserInfo RES = userMapper.userId(id);
        if(RES == null){
            return null;
        }
        //System.out.println("userMapper.userId(id)"+RES.getId());
        return RES; // 返回接口方法中的id,这里报错
    }

}
