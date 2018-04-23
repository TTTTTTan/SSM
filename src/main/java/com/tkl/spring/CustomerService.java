package com.tkl.spring;


/**
 *  Spring 中自动扫描功能
 * @author Administrator
 * 
 * @Component – 指示自动扫描组件。
 * @Repository – 表示在持久层DAO组件。
 * @Service – 表示在业务层服务组件。
 * @Controller – 表示在表示层控制器组件。
 * 四种注解都是自动扫描注解，只是便于阅读
 * 默认情况下，Spring 将小写部件的第一字符如 customerService
 * 要是想自定义名称则可以@Service("AAA")
 */



@org.springframework.stereotype.Component
public class CustomerService {
	@Override
	public String toString() {
		return "Component注解自动扫描";
	}
}
