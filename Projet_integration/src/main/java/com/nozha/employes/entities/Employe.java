package com.nozha.employes.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Employe {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String cin ;
	private String nomEmploye;
	private String Email;
	private  String tele;
	private String addresse ;
	private String password ;
	
	@ManyToMany
	private Projet projet;

	public Employe() {
		super();
	}
	
	
	

	public Employe(String cin, String nomEmploye, String email, String tele, String addresse, String password) {
		super();
		this.cin = cin;
		this.nomEmploye = nomEmploye;
		Email = email;
		this.tele = tele;
		this.addresse = addresse;
		this.password = password;
	}




	public Long getIdEmploye() {
		return idEmploye;
	}




	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}




	public String getCin() {
		return cin;
	}




	public void setCin(String cin) {
		this.cin = cin;
	}




	public String getNomEmploye() {
		return nomEmploye;
	}




	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public String getTele() {
		return tele;
	}




	public void setTele(String tele) {
		this.tele = tele;
	}




	public String getAddresse() {
		return addresse;
	}




	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Projet getProjet() {
		return projet;
	}




	public void setProjet(Projet projet) {
		this.projet = projet;
	}






}
