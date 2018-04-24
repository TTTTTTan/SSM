package com.ssm.entity;

public class User {
	private String id;
	private String name;
	private int age;
	private String sex;
	private String userName;
	private String passWord;
	
	public User(){
	}
	
	public User(String id,String name,int age,String sex,String userName,String passWord){
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void sayit(){
		System.out.println("user create");
	}
}
