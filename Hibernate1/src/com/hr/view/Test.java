package com.hr.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hr.domain.Employee;
import com.hr.util.MySessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delEmployee();
	}

	public static void delEmployee() {
		//我们应当保证sessionFactory是单态的
		//获取我们的工具类
		Session session = MySessionFactory.getMySessionFactory().openSession();
		Transaction transaction= session.beginTransaction();
		//修改用户：1.获取要修改的用户，然后进行删除
		//load方法可以通过主键属性获取该对象的实例---表的对应记录
		Employee employee = (Employee) session.load(Employee.class, 2);
		session.delete(employee);
		transaction.commit();
		session.close();
	}

	public static void updEmployee() {
		//我们应当保证sessionFactory是单态的
		//获取我们的工具类
		Session session = MySessionFactory.getMySessionFactory().openSession();
		Transaction transaction= session.beginTransaction();
		//修改用户：1.获取要修改的用户，然后进行修改
		//load方法可以通过主键属性获取该对象的实例---表的对应记录
		Employee employee = (Employee) session.load(Employee.class, 2); //类名.class 表示类的
		employee.setName("test3");
		transaction.commit();
		session.close();
	}
	
	/**
	 * 添加雇员
	 */
	public static void addEmployee() {
		//1.创建configuration
		//如果不指定，那么就直接获取hibernate.cfg.xml
		//该对象用于获取hibernate.cfg.xml的配置，并且进行初始化
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		//2.闯将sessionFactory
		SessionFactory sf = cfg.buildSessionFactory();
		//3.创建session，相当于jdbc的一个连接
		Session session = sf.openSession();
		//4.对于hibernate，要求增删改用事务提交
		Transaction ts = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("test");
		employee.setEmail("test@xib.com.cn");
		employee.setHireDate(new Date());
		session.save(employee);
		ts.commit();
	}

}
