package com.funtl.hello.spring.boot.service;

import com.funtl.hello.spring.boot.pojo.User;

import java.util.List;



public interface UserService {

	List<User> findUserList();	//查询所有


	int addUser(User user);      //增加用户


	int deleteUser(Integer id);  //删除

	int updateUser(User user);   //更新

}
