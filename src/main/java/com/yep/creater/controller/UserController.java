package com.yep.creater.controller;

import com.yep.creater.model.User;
import com.yep.creater.service.UserServiceInterface;
import com.yep.creater.utils.ConstantMsg;
import com.yep.creater.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private UserServiceInterface userService;
    @Autowired
    public UserController(UserServiceInterface userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/getUserById")
    public ResultData<User> getUserById(Integer userId){
        try {
            return userService.getUserById(userId);
        } catch (Exception e) {
            LOGGER.error("Failed to get the user.");
            return null;
        }
    }

    @RequestMapping("/getAllUsers")
    public ResultData<List<User>> getAllUsers(){

        try {
            return userService.getAllUsers();
        } catch (Exception e){
            LOGGER.error("Failed to get all users", e);
            return null;
        }

    }

    @RequestMapping("/deleteUserById")
    public ResultData<Integer> deleteUseById(Integer userId){

        try {
            return userService.deleteUserById(userId);

        } catch (Exception e){
            LOGGER.error("Failed to delete the user");
            return null;
        }

    }

    @RequestMapping("/updateUser")
    public ResultData<Integer> updateUser(User user){

        try {
            /*
            user = userService.getUserById(123457);
            LOGGER.info(user.getUserName());
            user.setUserName("def");
            user.setUserPwd("fed");
            */
            return userService.updateUser(user);

        } catch (Exception e){
            LOGGER.error("Failed to update the user");
            return null;
        }
    }

    @RequestMapping("/addUser")
    public ResultData<Integer> addUser(User user){
        try {
            /*
            user.setUserName("vbn");
            user.setUserPwd("nbv");
            */
            return userService.addUser(user);
        } catch (Exception e){
            LOGGER.error("Failed to update the user");
            return null;
        }
    }

/*
    @RequestMapping(value = "/login")
    public ResultData<Map<String, Object>> login(@RequestParam("phone") String phone,
                                                 @RequestParam("password") String password){
        LOGGER.info("received user login request: phone = {}, password = {}", phone, password);
        Map<String, Object> loginResult = new LinkedHashMap<String, Object>();
        try{
            if(StringUtils.isEmpty(phone)){
                return ResultData.error(ConstantMsg.ERROR_USER_PHONE_NOT_NULL);
            }
            if(StringUtils.isEmpty(password)){

                return ResultData.error(ConstantMsg.ERROR_USER_PASSWORD_NOT_NULL);
            }
            ResultData<User> resultData = userService.getUserByPhoneAndPassword(phone, password);
            if(!resultData.isSuccessful()){
                LOGGER.error("登录失败，用户名或密码错误: phone={}, password={}", phone, password);
                return ResultData.error(resultData.getErrorMsg());
            }
            LOGGER.error("登录成功: phone={}, password={}", phone, password);
        }catch(Exception e){
             e.printStackTrace();
        }
        return ResultData.ok(loginResult);
    }
*/




}
