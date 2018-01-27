package com.hr.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 一个hibernate工程，最好只有一个SessionFactory
 * 一个数据库对应一个sessionFactory 
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
