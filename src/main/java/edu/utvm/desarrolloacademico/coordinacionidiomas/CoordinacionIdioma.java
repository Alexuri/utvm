package edu.utvm.desarrolloacademico.coordinacionidiomas;
import java.util.ArrayList;

import edu.utvm.departamentofinanza.departamentopersonal.*;
public class CoordinacionIdioma {

  private JefeArea jefe;
	private ArrayList<Docente> docente;
	private ArrayList<Asistente> asistente;

	public CoordinacionIdioma(JefeArea jefe,Docente docente, Asistente asistente ) {
		this.jefe = new JefeArea();
		this.docente = new ArrayList<Docente>();
		this.asistente= new ArrayList<Asistente>();
	}
}
