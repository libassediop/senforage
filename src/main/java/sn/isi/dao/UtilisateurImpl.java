package sn.isi.dao;

import java.util.List;

import org.hibernate.Query;

import sn.isi.entities.Utilisateur;

public class UtilisateurImpl extends RepositoryImpl<Utilisateur> implements IUtilisateur {

	
	
	public void  login(String email,String password){
		
	}
	
	
	@SuppressWarnings("deprecation")
	public Utilisateur getUtlisateurByMail(String email) {
		Utilisateur ut =new Utilisateur();
		Query query = session.createQuery("from utilisateur u where u.email = :email ");
		query.setParameter("email", email);
		List<Utilisateur> list = query.list();
		return list.get(0);
		
	}
	
}
