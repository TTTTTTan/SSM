package com.tkl.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//不建议使用InitializingBean和DisposableBean的接口，因为它将你的代码紧耦合到 Spring 代码中。 
//一个更好的做法应该是在bean的配置文件属性指定 init-method和destroy-method。
public class CustomerService1 implements InitializingBean, DisposableBean
{
	String message;
	
	public String getMessage() {
	  return message;
	}

	public void setMessage(String message) {
	  this.message = message;
	}
	
	public void afterPropertiesSet() throws Exception {
	  System.out.println("Init method after properties are set : " + message);
	}
	
	public void destroy() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
	
}
