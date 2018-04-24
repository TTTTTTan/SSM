package com.ssm.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ssm.entity.User;
import com.ssm.mapper.UserMapper;

/**
 * Hello world!
 *
 */
@SuppressWarnings("restriction")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Word!");
	}
	
	public SqlSession getSqlSession(){
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);// build也可以传递配置文件属性值
		return sqlSessionFactory.openSession();
	}

	@Test
	public void startMybaits() throws IOException {
		SqlSession session =  getSqlSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectById("001");
		System.out.println("欢迎你" + user.getName());
		session.close();
	}

	@Test
	public void insertMybaits() {
		SqlSession session =  getSqlSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.add(new User("003","多蒙",30,"男","duomen","duomen"));
		 // 提交事务
        session.commit();
		session.close();
	}
	
	@Test
	public void updateMybaits(){
		SqlSession session =  getSqlSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.update(new User("003","ddddmmm",30,"男","ddddmmm","ddddmmm"));
		 // 提交事务
        session.commit();
		session.close();
	}
	
	@Test
	public void deleteMybaits(){
		SqlSession session =  getSqlSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.delete("003");
		 // 提交事务
        session.commit();
		session.close();
	}
}
