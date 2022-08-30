package com.leslie.ssm.mapper;

import com.leslie.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 从数据库中查询出所有的User对象
     * @return User对象集合
     */
    List<User> selectAll();
}