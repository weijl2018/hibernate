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
		//����Ӧ����֤sessionFactory�ǵ�̬��
		//��ȡ���ǵĹ�����
		Session session = MySessionFactory.getMySessionFactory().openSession();
		Transaction transaction= session.beginTransaction();
		//�޸��û���1.��ȡҪ�޸ĵ��û���Ȼ�����ɾ��
		//load��������ͨ���������Ի�ȡ�ö����ʵ��---��Ķ�Ӧ��¼
		Employee employee = (Employee) session.load(Employee.class, 2);
		session.delete(employee);
		transaction.commit();
		session.close();
	}

	public static void updEmployee() {
		//����Ӧ����֤sessionFactory�ǵ�̬��
		//��ȡ���ǵĹ�����
		Session session = MySessionFactory.getMySessionFactory().openSession();
		Transaction transaction= session.beginTransaction();
		//�޸��û���1.��ȡҪ�޸ĵ��û���Ȼ������޸�
		//load��������ͨ���������Ի�ȡ�ö����ʵ��---��Ķ�Ӧ��¼
		Employee employee = (Employee) session.load(Employee.class, 2); //����.class ��ʾ���
		employee.setName("test3");
		transaction.commit();
		session.close();
	}
	
	/**
	 * ��ӹ�Ա
	 */
	public static void addEmployee() {
		//1.����configuration
		//�����ָ������ô��ֱ�ӻ�ȡhibernate.cfg.xml
		//�ö������ڻ�ȡhibernate.cfg.xml�����ã����ҽ��г�ʼ��
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		//2.����sessionFactory
		SessionFactory sf = cfg.buildSessionFactory();
		//3.����session���൱��jdbc��һ������
		Session session = sf.openSession();
		//4.����hibernate��Ҫ����ɾ���������ύ
		Transaction ts = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("test");
		employee.setEmail("test@xib.com.cn");
		employee.setHireDate(new Date());
		session.save(employee);
		ts.commit();
	}

}
