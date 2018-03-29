package com.yep.creater.service.impl;

import com.yep.creater.dao.UserDao;
import com.yep.creater.model.User;
import com.yep.creater.service.UserServiceInterface;
import com.yep.creater.utils.ConstantMsg;
import com.yep.creater.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public ResultData<User> getUserById(Integer userId) throws Exception {
        User user = userDao.selectUserById(userId);
        if(user == null){
            return ResultData.error(ConstantMsg.ERROR_USER_NOT_FOUND);
        }
        return ResultData.ok(userDao.selectUserById(userId));
    }

    @Override
    public ResultData<List<User>> getAllUsers() throws Exception {
        return ResultData.ok(userDao.selectAllUsers());
    }

    @Override
    public ResultData<Integer> deleteUserById(Integer userId) throws Exception{
        return ResultData.ok(userDao.deleteUserById(userId));
    }

    @Override
    public ResultData<Integer> updateUser(User user) throws Exception{
        return ResultData.ok(userDao.updateUser(user));
    }

    @Override
    public ResultData<Integer> addUser(User user) throws Exception{
        return ResultData.ok(userDao.addUser(user));
    }
}
