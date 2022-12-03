package com.nozha.employes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Employe.class })
public interface EmployeProjection {
	public String getNomEmploye();

}
