package com.hr.domain;

import java.io.Serializable;

/**
 * pojo plain ordinaty java object
 * @author weijl
 *
 *ȡ�� ����
 *���� �ֶ���
 *��get set����
 *��һ���޲εĹ��췽����hibernate���������Ҫ��
 *��Ҫ���л������л���Ϊ��Ψһ��ʾһ������ͬʱ������������ļ�����
 *���û�����л����Ͳ�֪����Ӧ����ĸ���¼
 */
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private java.util.Date hireDate;//��Ӧ���ݿ��date����
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
