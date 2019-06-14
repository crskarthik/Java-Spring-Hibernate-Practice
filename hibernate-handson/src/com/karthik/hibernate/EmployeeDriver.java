package com.karthik.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session s = sf.getCurrentSession();
		try {
			s.beginTransaction();
//			s.save(new Employee("Karthik", "Chinta", "Cognizant"));
//			s.save(new Employee("Aditya", "Chinta", "Google"));
//			s.save(new Employee("Srinivas", "Chinta", "Govt. Of AP"));
//			s.save(new Employee("Lakshmi", "Sreeramagiri", "IAS, Govt Of AP"));
//			s.save(new Employee("Test First name", "Test Last name", "Test company"));
//			int id = 11;
//			List<Employee> emps = s.createQuery("from Employee where company like '%Of AP'").list();
//			for(Employee emp:emps) {System.out.println(emp);}
// 			System.out.println("emp id with id = 11 is: "+emp);
//			s.getTransaction().commit();
//			System.out.println("All employees saved");
			//Delete using primary key
			int id = 10;
			Employee delEmp = s.get(Employee.class, id);
			s.delete(delEmp);
			System.out.println(delEmp);
			s.getTransaction().commit();
			
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
	}

}
