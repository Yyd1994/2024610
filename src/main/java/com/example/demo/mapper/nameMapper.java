package com.example.demo.mapper;

import com.example.demo.bean.informationBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface nameMapper {
    informationBean getInfo(@Param("name")String name, @Param("password")String password);
}
