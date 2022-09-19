package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Compteur  implements Serializable   {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String numero;
	@Column(length = 2)
	private int etat;
	@Column(length = 2)
	private int index;
	@OneToMany(mappedBy ="compteur" )
	private List<Abonnement> abonnements = new ArrayList<Abonnement>();
	@OneToMany(mappedBy ="compteur" )
	private List<Facture> factures = new ArrayList<Facture>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public List<Abonnement> getAbonnements() {
		return abonnements;
	}
	public void setAbonnements(List<Abonnement> abonnements) {
		this.abonnements = abonnements;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	

}
