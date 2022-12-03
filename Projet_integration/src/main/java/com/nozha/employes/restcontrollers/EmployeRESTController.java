package com.nozha.employes.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nozha.employes.entities.Employe;
import com.nozha.employes.service.EmployeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeRESTController {
	
	@Autowired
	EmployeService employeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employe> getAllEmployes()
	{
		return employeService.getAllEmployes();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Employe getEmployeById(@PathVariable("id") Long id) {
		return employeService.getEmploye(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employe createEmploye(@RequestBody Employe employe) {
			return employeService.saveEmploye(employe);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Employe updateEmploye(@RequestBody Employe employe) {
		return employeService.updateEmploye(employe);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmploye(@PathVariable("id") Long id)
	{
			employeService.deleteEmployeById(id);
	}
	
	@RequestMapping(value="/prodscat/{idProjet}",method = RequestMethod.GET)
	public List<Employe> getEmployesByProjetId(@PathVariable("idProjet") Long idProjet) {
		return employeService.findByProjetIdProjet(idProjet);
	}

	
	
	


}
