package com.karthik.hibernate.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDriver {

	public static void main(String[] args) {
//
		SessionFactory fac = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
//		SessionFactory fac1 = new Configuration().configure().addAnnotatedClass(Faculty.class).buildSessionFactory();
		Session session = fac.getCurrentSession();
//		Session session1 = fac1.getCurrentSession();

		try {
//			Student tempStudent = new Student("Karthik", "Raja", "kairaja@gmail.com");
			session.beginTransaction();
//			session.save(new Student("Karthik", "Chinta", "karthik@gmail.com"));
//			session.save(new Student("Srikar", "Chinta", "srikar@gmail.com"));
//			session.save(new Student("Raja", "Chinta", "raja@gmail.com"));
//			session.save(new Student("R S", "Karthik", "rskarthik@gmail.com"));
//			session.save(new Faculty("Karthik", "Chinta","Asst.Professor", "karthik@gmail.com"));
//			session.save(new Faculty("Srikar", "Chinta", "Asst.Professor","srikar@gmail.com"));
//			session.save(new Faculty("Raja", "Chinta", "Asst.Professor","raja@gmail.com"));
//			session.save(new Faculty("R S", "Karthik","Professor", "rskarthik@gmail.com"));
			session.getTransaction().commit();
			session.getTransaction().commit();
			List<Student>students = session.createQuery("from Student").list();
			displayListOf(students);
			students = session.createQuery("from Student s where s.lastName = 'chinta'").list();
			displayListOf(students);
			students = session.createQuery("from Student s where s.lastName = 'chinta' OR s.lastName = 'Raja'").list();
			displayListOf(students);
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			fac.close();
		}
	}

	private static void displayListOf(List<Student> sl) {
		for(Student s:sl) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
	}

}
