package com.ssi;

import org.hibernate.Session;

public class EmpEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Util().getSF().openSession();
		/*
		Emp e1 = new Emp(4001, "AAA",52000,new laptop("L111"));
		e1.getProject().add(new Project(101));
		e1.getProject().add(new Project(102));*/
		
		Emp e2 = new Emp(4002, "BBB",50000,new Laptop("L112"));
		e2.getProject().add(new Project(102));
		e2.getProject().add(new Project(103));
		
		
	
		Emp e3 = new Emp(4003, "CCC",62000,new Laptop("L113"));
		e3.getProject().add(new Project(101));
		e3.getProject().add(new Project(103));
		
	
		org.hibernate.Transaction tr=session.beginTransaction();
		
		//session.save(e1);
		session.save(e2);
		session.save(e3);
		
		tr.commit();
		session.close();
		System.out.println("Data Added");

	}

}