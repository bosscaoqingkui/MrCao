package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.bean.UserInfo;
import com.example.SpringBootDemo.dao.UserInfoDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDaoMapper userInfoDao ;

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public Boolean deleteById(Long id) {
        return userInfoDao.deleteById(id) == 1;
    }

    @Override
    public Boolean updateUser(UserInfo user) {
        return userInfoDao.updateUser(user) == 1;
    }
    public UserInfo addUser(UserInfo user){
        return userInfoDao.addUser(user);
    }



}
