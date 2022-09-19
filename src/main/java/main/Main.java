package main;

import java.util.ArrayList;
import java.util.List;

import sn.isi.dao.ChefdevillageImpl;
import sn.isi.dao.IChefdevillage;
import sn.isi.entities.Chefdevillage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IChefdevillage chefVilDao = new  ChefdevillageImpl();
		Chefdevillage chef = new Chefdevillage();
		chef.setNom("Diop");
		chef.setPrenom("Limamou");
		chef.setTelephone("771926");
		chef.setFonction("Informaticien");
		System.out.println(chef.toString());
		int result= chefVilDao.add(chef);
		List<Chefdevillage> listch =new ArrayList<Chefdevillage>();
		listch= chefVilDao.list(chef);
		System.out.println(listch);
		
	}

}
