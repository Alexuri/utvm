package edu.utvm.subdireccionplaneacion.serviciosescolares;
import edu.utvm.departamentofinanza.departamentopersonal;


public class Escolares{

  public ControlAspAlumEgre controlAspAlumEgre;
	public JefeArea jefeArea;
	public Administrativo administrativo;
	
	public Escolares ( ControlAspAlumEgre controlAspAlumEgre,Administrativo administrativo, JefeArea jefeArea){

		ControlAspAlumEgre controlAspAlumEgre = new ControlAspAlumEgre();
		Administrativo administrativo = new Administrativo();
		JefeArea jefeArea = new JefeArea ();


	}

	
}
