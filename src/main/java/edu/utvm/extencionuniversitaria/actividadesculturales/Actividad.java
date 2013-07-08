package edu.utvm.extencionuniversitaria.actividadesculturales;
import java.util.ArrayList;

  public class Actividad{
	public String tipoActividad;
	public FormatoRegistro formatoregistro;
	
	public List <Clase> clase; //ArrayList
	
	public void Actividad(){
	clase =new ArrayList <Clase>();		
	}

	public Instructor instructor;
	public FormatoRegistro formatoRegistro;
	public alumno alumno;
	this.formatoRegistro =new FormatoRegistro();
	

	public List <Alumno> alumno; //----->ArrayList

		public Actividad(){
		alumno =new ArrayList <Alumno>();		
		}


}
