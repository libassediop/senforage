package sn.isi.entities;
import java.io.Serializable;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "personne")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne implements Serializable  {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @CollectionTable(name = "id")
	    private int id;
	    @Column(name = "nom")
	    private String nom;
	    @Column(name = "prenom")
	    private String prenom;
	    @Column(name = "telephone")
	    private long telephone;
	    
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public long getTelephone() {
			return telephone;
		}
		public void setTelephone(long telephone) {
			this.telephone = telephone;
		}
	    
	    
	    

}
