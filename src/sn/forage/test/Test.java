package sn.forage.test;

import sn.forage.dao.ClientsImpl;
import sn.forage.dao.IClients;
import sn.forage.entities.Clients;
import sn.forage.entities.Village;

public class Test {
	public static void main(String []args) {
		IClients clientsdao = new ClientsImpl(); 
		Clients clients = new Clients();
		Village village = new Village();
		
		village.setId(1);
		village.setNom("Tattaguine");
		village.setNom("dakar");
		clients.setNom("fatou");
		clients.setNumero("3333");
		clients.setPrenom("Fall");
		
		
		System.out.println(clientsdao.add(clients));
		
		//EntityManager
		
	}

}

