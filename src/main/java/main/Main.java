package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import sn.isi.dao.AbonnementImpl;
import sn.isi.dao.ChefdevillageImpl;
import sn.isi.dao.ClientImpl;
import sn.isi.dao.CompteurImpl;
import sn.isi.dao.FactureImpl;
import sn.isi.dao.IAbonnement;
import sn.isi.dao.IChefdevillage;
import sn.isi.dao.IClient;
import sn.isi.dao.ICompteur;
import sn.isi.dao.IFacture;
import sn.isi.dao.IReglement;
import sn.isi.dao.IRole;
import sn.isi.dao.IUtilisateur;
import sn.isi.dao.IVillage;
import sn.isi.dao.ReglementImpl;
import sn.isi.dao.RoleImpl;
import sn.isi.dao.UtilisateurImpl;
import sn.isi.dao.VillageImpl;
import sn.isi.entities.Abonnement;
import sn.isi.entities.Chefdevillage;
import sn.isi.entities.Client;
import sn.isi.entities.Compteur;
import sn.isi.entities.Facture;
import sn.isi.entities.Role;
import sn.isi.entities.Utilisateur;
import sn.isi.entities.Village;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IChefdevillage chefVilDao = new  ChefdevillageImpl();
		IVillage villageDao = new  VillageImpl();
		IClient clientDao = new  ClientImpl();
		ICompteur compteurDao = new CompteurImpl();
		IAbonnement abonnementDao = new AbonnementImpl();
		IRole roleDao = new RoleImpl();
		IUtilisateur utilisateurDao =new  UtilisateurImpl();
		IFacture factureDao = new FactureImpl();
		IReglement reglementDao = new ReglementImpl();
		
		System.out.println("creation chef de village ");
		System.out.println(utilisateurDao.getUtlisateurByMail("TikoKane@gmail.com"));
		
//		Chefdevillage chef = new Chefdevillage();
//		chef.setNom("Diop");
//		chef.setPrenom("Ibrahima");
//		chef.setTelephone("771922061");
//		chef.setFonction("Electricien");
//		int result =chefVilDao.add(chef);
//		System.out.println("creation village ");
//		Village village = new Village();
//		village.setLibelle("medina");
//		village.setChefvillage(chef);
//		 result=villageDao.add(village);
//		System.out.println("creation d'un client ");
//		Client client = new Client();
//		client.setNom("Ba");
//		client.setPrenom("Pape malick");
//		client.setAdresse("Bastos");
//		client.setTelephone("773714388");
//		client.setVillage(village);
//		clientDao.add(client);
//		System.out.println("creation d'un Compteur ");
//		Compteur compteur = new Compteur();
//		int num= GenerateNumCompeur(1000, 99999);
//		compteur.setNumero("N00"+num);
//		compteur.setEtat(1);
//		compteur.setIndex(198);
//		System.out.println(compteur.toString());
//		int res= compteurDao.add(compteur);
//		System.out.println(res);
//		System.out.println("creation d'un Abonnement ");
//		Abonnement abonnement = new Abonnement();
//		abonnement.setClient(client);
//		abonnement.setCompteur(compteur);
//		abonnement.setDescriptipn("nouvelle abonnement du client ");
//		abonnement.setDate(new Date());
//		abonnement.setNumero(String.valueOf( GenerateNumCompeur(100, 500)));
//		abonnementDao.add(abonnement);
//		abonnement.setDescriptipn("Creation d'un nouveau Role ");
//		Role role = new Role();
//		role.setLibelle("ROLE_ADMIN");
//		roleDao.add(role);
//		Utilisateur utilisateur = new Utilisateur();
//		utilisateur.setNom("Kane");
//		utilisateur.setPrenom("Tiko");
//		utilisateur.setEmail("TikoKane@gmail.com");
//		utilisateur.setEtat(1);
//		utilisateur.setTelephone("771768180");
//		utilisateur.setRole(role);
//		utilisateur.setPassword("passer");
//		utilisateurDao.add(utilisateur);
//		abonnement.setDescriptipn("Creation d'une Facture");
//		Facture facture = new Facture();
//		facture.setDate(new Date());
//		facture.setCompteur(compteur);
//		facture.setPrix_unitaire(1250);
//		facture.setStatut(true);
//		facture.setMontant(facture.getMontant());
//		facture.setUtilisateur(utilisateur);
//		factureDao.add(facture);
//		
		
		
//	
//		Chefdevillage chef = new Chefdevillage();
//		chef.setNom("Diop");
//		chef.setPrenom("Limamou");
//		chef.setTelephone("771926");
//		chef.setFonction("Informaticien");
//		System.out.println(chef.toString());
//		int result= chefVilDao.add(chef);
//		List<Chefdevillage> listch =new ArrayList<Chefdevillage>();
//		listch= chefVilDao.list(chef);
//		System.out.println(listch);
				
				
		
	}
	public static int GenerateNumCompeur(int min, int max){
	    Random random = new Random();
	    return random.ints(min,(max+1)).findFirst().getAsInt();
	}

}

