package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Chefdevillage extends Personne {


	
    private String fonction;
	
	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	@OneToMany(mappedBy ="chefdevillage" )
	private List<Village> village = new ArrayList<Village>();
	

	

	
	

	public List<Village> getVillage() {
		return village;
	}

	public void setVillage(List<Village> village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Chefdevillage [fonction=" + fonction + ", village=" + village + ", getId()=" + getId()
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getTelephone()=" + getTelephone()
				+ "]";
	}

	
	
	
}
