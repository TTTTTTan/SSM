package com.tkl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring框架 HelloWorld
 * @author Administrator
 *
 */
public class App {
	public static void main(String[] args) {
		Spring1();
	}
	
	public static void Spring4(){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	    	CustomerService2 cust = (CustomerService2)context.getBean("customerService2");
	    	System.out.println(cust);
	    	context.close();
	}
	
	public static void Spring3(){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	    	CustomerService1 cust = (CustomerService1)context.getBean("customerService1");
	    	System.out.println(cust);
	    	context.close();
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