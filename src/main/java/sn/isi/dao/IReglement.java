package sn.isi.dao;

import sn.isi.entities.Reglement;

public interface IReglement extends Repository<Reglement>{

	public void CouperFacture();
	public void PayerFacture(int idFacture);
	public double GetMontantFactureAPayer(int idFacture);
	
	
}
