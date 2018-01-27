package com.hr.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * һ��hibernate���̣����ֻ��һ��SessionFactory
 * һ�����ݿ��Ӧһ��sessionFactory 
 * @author weijl
 *
 */
final public class MySessionFactory {
	private static SessionFactory sessionFactory = null;
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getMySessionFactory(){
		return sessionFactory;
	}
}
