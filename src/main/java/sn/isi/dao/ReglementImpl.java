package sn.isi.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import sn.isi.entities.Facture;
import sn.isi.entities.Reglement;
import sn.isi.entities.Village;

public class ReglementImpl extends RepositoryImpl<Reglement> implements IReglement {
	
	IFacture factureDao = new FactureImpl();
	ICompteur compteurDao = new CompteurImpl();
	
	public double GetMontantFactureAPayer(int idFacture) {
		double netApayer=0;
		Facture facture = new Facture();
		factureDao.get(idFacture, facture);
		Date date= new Date();
		if(date.getMonth()>facture.getDate().getMonth() && date.getDay() >5) {
			netApayer=facture.getMontant() +( facture.getMontant() *  0.05);
			return netApayer;
		}
		return  netApayer;
	}
	
	public void PayerFacture(int idFacture) {
		Facture facture = new Facture();
		factureDao.get(idFacture, facture);
		facture.setStatut(false);
		factureDao.update(facture);
	}
	
	public void CouperFacture() {
		Facture facture = new Facture();
		 List<Facture> ListFacture = new ArrayList<Facture>();
		 ListFacture= factureDao.list(facture);
		for (Facture facture2 : ListFacture) {
			if(facture2.getStatut()==true) {
				facture2.getCompteur().setEtat(0);
				compteurDao.update(facture2.getCompteur());
			}
		}
		
	}
	
	
}
