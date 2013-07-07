package edu.utvm.extencionuniversitaria.actividadesculturales;

import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;
  
public class FormatoResgistro{
	public Alumno alumno;

	public FormatoRegistro(){
		alumno x=new Alumno();
	  	x.registra();
	  	System.out.printline(x);
	}
}


