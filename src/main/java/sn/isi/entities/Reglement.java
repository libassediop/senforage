package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Reglement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double net_a_payer;
	private Date date;
	@ManyToOne
	private Facture facture= new Facture();
	@ManyToOne
	private Utilisateur utilisateur= new Utilisateur();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNet_a_payer() {
		return net_a_payer;
	}
	public void setNet_a_payer(double net_a_payer) {
		this.net_a_payer = net_a_payer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
}
