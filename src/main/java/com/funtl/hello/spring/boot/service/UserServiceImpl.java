package com.funtl.hello.spring.boot.service;

import java.util.List;

import javax.annotation.Resource;

import com.funtl.hello.spring.boot.dao.UserMapper;
import com.funtl.hello.spring.boot.pojo.User;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> findUserList() {
		return userMapper.getUserList();
	}

	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public int deleteUser(Integer id) {
		return userMapper.deleteUser(id);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

}
