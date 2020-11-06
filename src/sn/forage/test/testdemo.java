package sn.forage.test;

import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Village;

public class testdemo {
	public static void main(String []args) {
		IVillage villagedao = new VillageImpl();
		
		Village village = new Village();
		village.setNom("Tattaguine");
		//village.setClients("mareme");
		
		int ok = villagedao.add(village);
		System.out.println(ok);
		
		
		
		
	}

}
