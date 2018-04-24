package com.ssm.spring;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.entity.User;

public class AutowiredBean {
	//注解自动装配bean，可在属性，构造方法，setter方法中设置
	//@Autowired(required=false) 当Spring无法找到匹配的Bean装配，不抛出异常
	//@Qualifier("user") 自动装配一个特定的 bean
	//@Scope("prototype")作用域
	//@Required 依赖检查
	@Autowired
	public User user;

	public void setUser(User user) {
		this.user = user;
	}
	
	public void sayit(){
		if(user!=null){
			System.out.println(user.getName());
		}
	}
}
