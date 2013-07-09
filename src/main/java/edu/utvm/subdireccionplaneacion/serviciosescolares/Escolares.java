package edu.utvm.subdireccionplaneacion.serviciosescolares;

import edu.utvm.departamentofinanza.departamentopersonal.Administrativo;
import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;


public class Escolares{

  public ControlAspAlumEgre controlAspAlumEgre;
	public JefeArea jefeArea;
	public Administrativo administrativo;
	
	public Escolares ( ControlAspAlumEgre controlAspAlumEgre,Administrativo administrativo, JefeArea jefeArea){

		ControlAspAlumEgre controlAl = new ControlAspAlumEgre();
		Administrativo admin = new Administrativo(null, null, null, null, null, null, null, null, null, null, null);
		JefeArea jefeAre = new JefeArea (null, null, null, null, null, null, null, null, null, null, null);


	}

	
}
