package sn.forage.dao;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Clients; 

public class ClientsImpl implements IClients {

	 
	private	EntityManager em;
	
	
	public ClientsImpl () {
			EntityManagerFactory emf =  Persistence.createEntityManagerFactory("testPU");
		
		em = emf.createEntityManager();
		
	}
	@Override
	public int add(Clients clients) {
		try {
			
			em.getTransaction() .begin();
			em.persist(clients);
			em.getTransaction(). commit();	
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
			
			
			
		}
		// return 0;

		
		
	}

	

		
	

}
