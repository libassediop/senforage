package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur extends Personne {
	
	
	/**
	 * 
	 */
	@Column(length = 100, nullable = false, unique = true)
	private String email;
	@Column(length = 150, nullable = false)
	private String password;
	@Column(length = 1)
	private int etat;
	@ManyToOne
	private Role role= new Role();
	@OneToMany(mappedBy ="utilisateur" )
	private List<Facture> factures = new ArrayList<Facture>();
	@OneToMany(mappedBy ="utilisateur" )
	private List<Reglement> reglements = new ArrayList<Reglement>();
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	public List<Reglement> getReglements() {
		return reglements;
	}
	public void setReglements(List<Reglement> reglements) {
		this.reglements = reglements;
	}
	
	
	

}
