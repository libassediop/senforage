package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends Personne {

	/**
	 * 
	 */
	
	@Column(name = "adresse")
    private String adresse;
	@ManyToOne
	private Village village= new Village();
	@OneToMany(mappedBy ="client" )
	private List<Abonnement> abonnement = new ArrayList<Abonnement>();
	
	

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public List<Abonnement> getAbonnements() {
		return abonnement;
	}

	public void setAbonnements(List<Abonnement> abonnements) {
		this.abonnement = abonnements;
	}

	public Client() {
		super();
	}
	
	


   
	
	

}
