package com.ssi;
import org.hibernate.Session;

public class LaptopEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = new Util().getSF().openSession();
	
		Laptop l1 = new Laptop("L111", "DELL", 50000);
		Laptop l2 = new Laptop("L112", "HCL", 70000);
		Laptop l3 = new Laptop("L113", "HP", 40000);
		
		
		org.hibernate.Transaction tr=session.beginTransaction();
		
		session.save(l1);
		session.save(l2);
		session.save(l3);
		
		tr.commit();
		session.close();
		System.out.println("Data Added");
	

	}

}