package com.nozha.employes.entities;

import java.util.List;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Projet {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String titreProjet;
	private Date datedebut;
	private Date datefin;
	
	@ManyToMany (mappedBy = "projet")
	@JsonIgnore
	private List<Employe> employes;
    
	public Long getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public String getTitreProjet() {
		return titreProjet;
	}

	public void setTitreProjet(String titreProjet) {
		this.titreProjet = titreProjet;
	}
	
	
}
