package com.tns.jpacrud.dao;

// data access object (DAO)
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;//package----class

public class JPAUtil {
	private static EntityManagerFactory factory;// class
	private static EntityManager entityManager;// interface

//	Static Block 
	static {
		factory = Persistence.createEntityManagerFactory("JPA-PU");// persistant use
	}

	/*
	 * EntityManager 1 object sambhalto 
	 * 
	 * Collection == Database
	 * 
	 * Single Object  == EntityManager
	 * 
	 */
	public static EntityManager getEntityManager() {
//		if(true OR true)
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}