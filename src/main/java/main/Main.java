package main;

import sn.isi.dao.ChefdevillageImpl;
import sn.isi.dao.ClientImpl;
import sn.isi.dao.IChefdevillage;
import sn.isi.dao.IClient;
import sn.isi.entities.Chefdevillage;
import sn.isi.entities.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			IClient clientDao =new ClientImpl();
//			Client client = new Client();
//			client.setNom(null);
//			
//			int result = clientDao.add(client);
		
		IChefdevillage chefVilDao = new  ChefdevillageImpl();
		Chefdevillage chef = new Chefdevillage();
		chef.setNom("Diop");
		chef.setPrenom("Limamou");
		chef.setTelephone(77192);
		
		int result= chefVilDao.add(chef);
		System.out.println(result);
		
			
	}

}
