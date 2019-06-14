package com.karthik.hibernate.oneOnOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class InstructorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session s = sf.getCurrentSession();


		try {
			s.beginTransaction();
			//Insert
//			Instructor instruct = new Instructor("Karthik", "Chinta", "prof@ins.edu");
//			InstructorDetail instructorDetail = new InstructorDetail("Crazy Instructor", "Blogging");
//			instruct.setInstructorDetail(instructorDetail);
//			s.save(instruct);
			//Delete
			Instructor ins = s.get(Instructor.class, 1);
//			if(ins!=null) {
				System.out.println(ins);
			s.delete(ins);
//			}
			s.getTransaction().commit();
			
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			s.close();
			sf.close();
		}
	}

}
