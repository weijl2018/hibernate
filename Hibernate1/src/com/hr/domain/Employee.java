package com.hr.domain;

import java.io.Serializable;

/**
 * pojo plain ordinaty java object
 * @author weijl
 *
 *取名 表明
 *变量 字段名
 *有get set方法
 *有一个无参的构造方法（hibernate反射机制需要）
 *需要序列化，序列化是为了唯一标示一个对象，同时可以再网络和文件传输
 *如果没有序列化，就不知道对应表的哪个记录
 */
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private java.util.Date hireDate;//对应数据库的date类型
	public java.util.Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
