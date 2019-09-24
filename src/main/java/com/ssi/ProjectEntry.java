package com.ssi;

import org.hibernate.Session;

public class ProjectEntry {

	public static void main(String[] args) {
		Session session = new Util().getSF().openSession();
		
		Project p1 = new Project(101, "ERP","xyz");
		Project p2 = new Project(102, "RP","abc");
		Project p3 = new Project(103, "HCL","PQR");
		
	
		org.hibernate.Transaction tr=session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		session.close();
		System.out.println("Data Added");
	
	}

}