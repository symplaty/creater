package com.yep.creater.dao;

import com.yep.creater.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    User selectUserById(Integer userId);
    List<User> selectAllUsers();
    Integer deleteUserById(Integer userId);
    Integer updateUser(User user);
    Integer addUser(User user);
    User selectUserByPhoneAndPassword(String phone, String password);
}