package com.example.demo.mapper;

import com.example.demo.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    UserInfo userId(@Param("id")Integer id);
}
