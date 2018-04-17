package com.tkl.spring;

import com.tkl.entity.User;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
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
		if(user!=null){
			user.sayit();
		}
	}

	public void setUser(User user) {
		this.user = user;
	}
}