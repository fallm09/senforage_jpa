package sn.forage.test;

import sn.forage.dao.IUser;
import sn.forage.dao.UserImpl;
import sn.forage.entities.User;

public class demosimplon {
	public static void main(String []args) {
		
		IUser userdao = new UserImpl();
		User u = new User();
		u.setNom("Fall");
		u.setEmail("fallmena@gmail.com");
		u.setPrenom("Mareme");
		u.setEtat(1);
		u.setPassword("mareme24");
		System.out.println(userdao.add(u));
		
	}
}
