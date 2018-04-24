package com.ssm.mapper;

import com.ssm.entity.User;

public interface UserMapper {
	User selectById(String id);
	
	int add(User user);
	
	int update(User user);
	
	int delete(String id);
}

