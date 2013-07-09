package edu.utvm.extencionuniversitaria.actividadesculturales;

import java.util.ArrayList;
import java.util.List;

import edu.utvm.departamentofinanza.departamentopersonal.Instructor;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;

  public class Actividad{
	public String tipoActividad;
	public FormatoRegistro formatoregistro;
	

	public Instructor instructor;
	public Alumno alumno;
	
	public List<Clase>clases;
	public Actividad(){
		clases= new ArrayList <Clase>();		
	}
}
