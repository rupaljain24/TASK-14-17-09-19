package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Util {

	
	public SessionFactory getSF()
	{
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		return sf;

	}
	
}