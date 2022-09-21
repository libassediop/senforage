package sn.isi.dao;

import sn.isi.entities.Utilisateur;

public interface IUtilisateur extends Repository<Utilisateur> {
	public Utilisateur getUtlisateurByMail(String email);
}
