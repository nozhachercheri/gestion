package com.nozhaemployes;




import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nozha.employes.entities.Projet;
import com.nozha.employes.entities.Employe;
import com.nozha.employes.repos.EmployeRepository;


@SpringBootTest
class EmployesApplicationTests {

	@Autowired
	private EmployeRepository employeRepository;
	
	@Test
	public void testCreateEmploye() {
	Employe prod = new Employe("14406099","nozha","chercherinozha@gmail.com","50917494","123","pass");
	employeRepository.save(prod);
	}
	
	@Test
	public void testFindEmploye()
	{
	Employe p = employeRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateEmploye()
	{
	Employe p = employeRepository.findById(1L).get();
	p.setCin("14406090");
	employeRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteEmploye()
	{
		employeRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllEmployes()
	{
		List<Employe> prods = employeRepository.findAll();
		
		for (Employe p:prods)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindEmployeByNom()
	{
	List<Employe> prods = employeRepository.findByNomEmploye("PS 4");
	
	for (Employe p:prods)
		 System.out.println(p);
	
	}
	
	@Test
	public void testFindEmployeByNomContains()
	{
	List<Employe> prods = employeRepository.findByNomContains("P");
	
	for (Employe p:prods)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomcin()
	{
	List<Employe> prods = employeRepository.findByNomcin("PS 4", "14406055");
		for (Employe p : prods)
			{
				System.out.println(p);
			}
	}
	
	
	@Test
	public void testfindByProjet()
	{
	Projet proj = new Projet();
	proj.setIdProjet(1L);
	
	List<Employe> prods = employeRepository.findByProjet(proj);
	for (Employe p : prods)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByProjetIdProjet()
	{
	List<Employe> prods = employeRepository.findByProjetIdProjet(1L);
	for (Employe p : prods)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomEmployeAsc()
	{
	List<Employe> prods =  employeRepository.findByOrderByNomEmployeAsc();
	for (Employe p : prods)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierEmployeNomscin()
	{
	List<Employe> prods = employeRepository.trierEmployeNomsCin();
	for (Employe p : prods)
	{
	System.out.println(p);
	}
	}
	
	
}
