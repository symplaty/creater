package com.yep.creater.service;

import com.yep.creater.model.User;
import com.yep.creater.utils.ResultData;

import java.util.List;

public interface UserServiceInterface {
    ResultData<User> getUserById(Integer userId) throws Exception;
    ResultData<List<User>> getAllUsers() throws Exception;
    ResultData<Integer> deleteUserById(Integer userId) throws Exception;
    ResultData<Integer> updateUser(User user) throws Exception;
    ResultData<Integer> addUser(User user) throws Exception;
}
