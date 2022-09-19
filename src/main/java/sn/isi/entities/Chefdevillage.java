package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Chefdevillage extends Personne {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "chefVillage")
    private String chefVillage;
	
	@ManyToOne
	private Village village= new Village();

	public String getChefVillage() {
		return chefVillage;
	}

	public void setChefVillage(String chefVillage) {
		this.chefVillage = chefVillage;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	
	
}
