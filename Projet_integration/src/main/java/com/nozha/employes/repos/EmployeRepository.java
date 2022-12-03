package com.nozha.employes.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nozha.employes.entities.Projet;
import com.nozha.employes.entities.Employe;

@RepositoryRestResource(path = "rest")
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	
	List<Employe> findByNomEmploye(String nom);
	List<Employe> findByNomContains(String nom);
	
	/*@Query("select p from Employe p where p.nomEmploye like %?1 and p.prixProduit > ?2")
	List<Employe> findByNomcin (String nom, String cin);*/
	
	@Query("select p from Employe p where p.nomEmploye like %:nom and p.cinEmploye > :cin")
	List<Employe> findByNomcin (@Param("nom") String nom,@Param("cin") String  cin );

	@Query("select p from Employe p where p.categorie = ?1")
	List<Employe> findByProjet(Projet projet);
	
	List<Employe> findByProjetIdProjet(Long id);
	
	List<Employe> findByOrderByNomEmployeAsc();
	
	@Query("select p from Employe p order by p.nomEmploye ASC, p.cinEmploye DESC")
	List<Employe> trierEmployeNomsCin ();
	

}
