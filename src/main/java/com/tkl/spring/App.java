package com.tkl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring框架 HelloWorld
 * @author Administrator
 *
 */
public class App {
	public static void main(String[] args) {
		
		Spring2();
	}
	
	public static void Spring2(){
		AutowiredBean obj = (AutowiredBean) getContext().getBean("AutowiredBean");
		obj.sayit();
	}
	
	public static void Spring1(){
		//注入Bean
		HelloWorld obj = (HelloWorld) getContext().getBean("helloBean");
		obj.printHello();
	}
	
	public static ApplicationContext getContext(){
		//读取Spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		return context;
	}
}