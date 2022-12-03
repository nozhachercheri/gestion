package com.nozha.employes.service;

import java.util.List;

import com.nozha.employes.entities.Projet;
import com.nozha.employes.entities.Employe;

public interface EmployeService {
	Employe saveEmploye(Employe p);
	Employe updateEmploye(Employe p);
	void deleteEmploye(Employe p);
	void deleteEmployeById(Long id);
	Employe getEmploye(Long id);
	List<Employe> getAllEmployes();
	List<Employe> findByNomEmploye(String nom);
	List<Employe> findByNomEmployeContains(String nom);
	List<Employe> findByNomcin(String nom, String cin);
	List<Employe> findByProjet(Projet projet);
	List<Employe> findByProjetIdProjet(Long id);
	List<Employe> findByOrderByNomEmployeAsc();
	List<Employe> trierEmployesNomscin();


}
