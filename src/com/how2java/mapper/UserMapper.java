package com.how2java.mapper;

import com.how2java.pojo.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    //int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    void addUser(User user);
    
    User findByUsername(String name);
    //User findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
}