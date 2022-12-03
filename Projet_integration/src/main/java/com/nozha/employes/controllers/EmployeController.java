package com.nozha.employes.controllers;

import java.text.ParseException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nozha.employes.entities.Employe;
import com.nozha.employes.service.EmployeService;

@Controller
public class EmployeController {
	
	
	@Autowired
	EmployeService employeService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createEmploye";
	}
	
	@RequestMapping("/saveEmploye")
	public String saveEmploye(@ModelAttribute("employe") Employe employe,
							
	                          ModelMap modelMap) throws ParseException
	{
	
	
	Employe saveEmploye = employeService.saveEmploye(employe);
	String msg ="employe enregistré avec Id "+saveEmploye.getIdEmploye();
	modelMap.addAttribute("msg", msg);
	return "createEmploye";
	}
	
	@RequestMapping("/Listeemployes")
	public String listeEmployes(ModelMap modelMap)
	{
		List<Employe> prods = employeService.getAllEmployes();
		modelMap.addAttribute("employes", prods);
		return "listeEmployes";
	}
	
	@RequestMapping("/supprimerEmployes")
	public String supprimerEmploye(@RequestParam("id") Long id,
	ModelMap modelMap)
	{
		employeService.deleteEmployeById(id);
		List<Employe> prods = employeService.getAllEmployes();
		modelMap.addAttribute("employes", prods);
	return "listeEmployes";
	}
	
	@RequestMapping("/modifierEmployes")
	public String editerEmploye(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Employe p= employeService.getEmploye(id);
	modelMap.addAttribute("Employe", p);
	return "editerEmploye";
	}
	
	@RequestMapping("/updateEmployes")
	public String updateEmploye(@ModelAttribute("employe") Employe employe,
	
	ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	
	employeService.updateEmploye(employe);
	List<Employe> prods = employeService.getAllEmployes();
	modelMap.addAttribute("employes", prods);
	return "listeEmployes";
	}
	


}
