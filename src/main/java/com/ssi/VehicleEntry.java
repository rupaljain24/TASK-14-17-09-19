package com.ssi;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Util().getSF().openSession();

		Vehicle v1= new Vehicle(1002, "Audi", "A8", 15000000,new Emp(4003));
		Vehicle v2= new Vehicle(1004, "Jaguar", "XF", 35000000,new Emp(4003));
		Vehicle v3= new Vehicle(1005, "RangeRover", "Landcruizer", 5000000,new Emp(4002));
		
		System.out.println("RECORD..");
		Transaction tr = session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
		
	}

}