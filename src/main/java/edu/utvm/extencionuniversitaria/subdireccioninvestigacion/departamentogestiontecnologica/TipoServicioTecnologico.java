package edu.utvm.extencionuniversitaria.subdireccioninvestigacion.departamentogestiontecnologica;

import java.awt.List;

public class TipoServicioTecnologico {


	public String ite;
	public String calendario;
	public String soliciud;
	public String fichaRegistro;

	public List /*<ServicioTecnologico>*/ servicioTecnologico;
	public void TipoServicio(){
		
	}
	
		public String getIte() {
		return ite;
	}

	public void setIte(String ite) {
		this.ite = ite;
	}

	public String getCalendario() {
		return calendario;
	}

	public void setCalendario(String calendario) {
		this.calendario = calendario;
	}

	public String getSoliciud() {
		return soliciud;
	}

	public void setSoliciud(String soliciud) {
		this.soliciud = soliciud;
	}

	public String getFichaRegistro() {
		return fichaRegistro;
	}

	public void setFichaRegistro(String fichaRegistro) {
		this.fichaRegistro = fichaRegistro;
	}

	public List getServicioTecnologico() {
		return servicioTecnologico;
	}

	public void setServicioTecnologico(List servicioTecnologico) {
		this.servicioTecnologico = servicioTecnologico;
	}
 

 
	public class ArrayList{
	 
		ArrayList servicioTecnologico = new ArrayList();

	} 
	 
		public void conocerProyecto(){
		}
}

