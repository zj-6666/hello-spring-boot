package com.funtl.hello.spring.boot.dao;

import com.funtl.hello.spring.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

	List<User> getUserList(); //查询用户列表所有


	int addUser(User user);      //增加用户


	int deleteUser(Integer id);

	int updateUser(User user);
}
