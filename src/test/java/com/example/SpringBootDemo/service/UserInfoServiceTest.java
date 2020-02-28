package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.SpringbootexampleApplicationTests;
import com.example.SpringBootDemo.bean.UserInfo;
import com.example.SpringBootDemo.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.swing.*;
import java.util.Collection;
import java.util.List;

public class UserInfoServiceTest extends SpringbootexampleApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	private UserInfo userInfo;

	@Test
	public void testFindAll() {
		final List<UserInfo> userInfoList = userInfoService.findAll();
		assert userInfoList.isEmpty() == false;
	}

	@Test
	public void testDeleteById() {
		final Boolean flag = userInfoService.deleteById(1L);
		assert flag == false;
	}
	@Test
	public void testUpdate(){
		final Boolean flag_update = 	userInfoService.updateUser(userInfo);
		assert flag_update == false;
	}

	@Test
	public void addUser(){
		final UserInfo userInfo_test = userInfoService.addUser(userInfo);
		Assert.notEmpty((Collection<UserInfo>) userInfo_test,"添加失败");
	}

}
