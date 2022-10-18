package com.tns.dao;
import java.lang.module.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JPAUtil 
//Create The entity Manager for managing persistence Life cycle

{
	private static EntityManagerFactory factory;
	
	private static EntityManager entityManager;
	
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
		if(entityManager==null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
			
		}
		return entityManager;

	}
}


