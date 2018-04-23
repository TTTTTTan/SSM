package com.tkl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring框架 HelloWorld
 * @author Administrator
 */
public class App {
	public static void main(String[] args) {
		Spring7();
	}
	
	/**
	 * 切入点
	 */
	public static void Spring7(){
		HelloWorld helloWorld = (HelloWorld) getContext().getBean("customerServiceProxy");//新的代理对象，配有aop拦截
		System.out.println("*************************");
		helloWorld.printHello();
		System.out.println("*************************");
		helloWorld.printPoint();
		System.out.println("*************************");
		helloWorld.printThrowException();
	}
	
	/**
	 * aop
	 */
	public static void Spring6(){
		HelloWorld helloWorld = (HelloWorld) getContext().getBean("customerServiceProxy");//新的代理对象，配有aop拦截
		System.out.println("*************************");
		helloWorld.printHello();
		System.out.println("*************************");
		helloWorld.printHello();
		System.out.println("*************************");
		helloWorld.printThrowException();
	}
	
	/**
	 * 注解自动扫描
	 */
	public static void Spring5(){
		CustomerService cust = (CustomerService)getContext().getBean("customerService");
    	System.out.println(cust);
	}
	
	/**
	 * 和Spring3方法一样，不过推荐用这种
	 */
	public static void Spring4(){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	    	CustomerService2 cust = (CustomerService2)context.getBean("customerService2");
	    	System.out.println(cust);
	    	context.close();
	}
	
	/**
	 * 对于Bean实现 InitializingBean，它将运行 afterPropertiesSet()在所有的 bean 属性被设置之后。
	 * 对于 Bean 实现了DisposableBean，它将运行 destroy()在 Spring 容器释放该 bean 之后。
	 * 推荐是用Spring4的方法而不是这种方法
	 */
	public static void Spring3(){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	    	CustomerService1 cust = (CustomerService1)context.getBean("customerService1");
	    	System.out.println(cust);
	    	context.close();
	}
	
	/**
	 * 注解自动装配bean
	 */
	public static void Spring2(){
		AutowiredBean obj = (AutowiredBean) getContext().getBean("AutowiredBean");
		obj.sayit();
	}
	
	/**
	 * HelloWorld,Spring注入bean
	 */
	public static void Spring1(){
		//注入Bean
		HelloWorld obj = (HelloWorld) getContext().getBean("helloBean");
		obj.printHello();
	}
	
	/**
	 * 读取配置文件
	 * @return
	 */
	public static ApplicationContext getContext(){
		//读取Spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		return context;
	}
}