package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Village  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String libelle;
	@ManyToOne
	private Chefdevillage chefdevillage = new Chefdevillage();
	@OneToMany(mappedBy ="village" )
	private List<Client> clients = new ArrayList<Client>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Chefdevillage getChefvillage() {
		return chefdevillage;
	}
	public void setChefvillage(Chefdevillage chefvillage) {
		this.chefdevillage = chefvillage;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public Village() {
		super();
	}
	
	
}
