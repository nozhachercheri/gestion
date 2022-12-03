package com.nozha.employes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nozha.employes.entities.Projet;
import com.nozha.employes.entities.Employe;
import com.nozha.employes.repos.EmployeRepository;


@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public Employe saveEmploye(Employe p) {
		return employeRepository.save(p);
	}

	@Override
	public Employe updateEmploye(Employe p) {
		return employeRepository.save(p);
	}

	@Override
	public void deleteEmploye(Employe p) {
		employeRepository.delete(p);
		
	}

	@Override
	public void deleteEmployeById(Long id) {
		employeRepository.deleteById(id);
		
	}

	@Override
	public Employe getEmploye(Long id) {
		return employeRepository.findById(id).get();
	}

	@Override
	public List<Employe> getAllEmployes() {
		
		return employeRepository.findAll();
	}

	@Override
	public List<Employe> findByNomEmploye(String nom) {
		
		return employeRepository.findByNomEmploye(nom);
	}

	@Override
	public List<Employe> findByNomEmployeContains(String nom) {
		
		return employeRepository.findByNomContains(nom);
	}

	@Override
	public List<Employe> findByNomcin(String nom, String cin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> findByProjet(Projet projet) {
		
		return employeRepository.findByProjet(projet);
	}

	@Override
	public List<Employe>findByProjetIdProjet(Long id) {
	
		return employeRepository.findByProjetIdProjet(id);
	}

	@Override
	public List<Employe> findByOrderByNomEmployeAsc() {
		
		return employeRepository.findByOrderByNomEmployeAsc();
	}

	@Override
	public List<Employe> trierEmployesNomscin() {
	
		return employeRepository.trierEmployeNomsCin();
	}
	
	

}
