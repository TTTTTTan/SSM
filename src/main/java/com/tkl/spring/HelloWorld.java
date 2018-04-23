package com.tkl.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.tkl.entity.User;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
	private String value;
	private User user;
	
	public HelloWorld(){
		
	}
	
	public HelloWorld(User user) {
		this.user = user;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
		System.out.println("Spring 3 : Value=" + value);
		if(user!=null){
			user.sayit();
		}
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	//同CustomerService2.java一样
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : ");
	}
	//同CustomerService2.java一样
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	
	public void printPoint(){
		System.out.println("测试切入点方法");
	}
}

