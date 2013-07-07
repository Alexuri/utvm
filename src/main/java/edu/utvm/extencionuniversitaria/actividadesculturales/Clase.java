package edu.utvm.extencionuniversitaria.actividadesculturales;

import java.util.ArrayList;
  
	public class Clase{
		public Date dia;
		public DateTime hora;
		public String lugar;

		public List <Alumno> alumno;//---->ArrayList

		public Clase(){
		this.alumno = new ArrayList <Alumno>();
		}
	}
