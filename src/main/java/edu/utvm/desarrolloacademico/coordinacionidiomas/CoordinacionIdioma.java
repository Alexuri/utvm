package edu.utvm.desarrolloacademico.coordinacionidiomas;
import java.util.ArrayList;
import java.util.List;

import edu.utvm.departamentofinanza.departamentopersonal.*;
public class CoordinacionIdioma {

  	private JefeArea jefe;
	private List<Docente> docente;
	private List<Asistente> asistente;

	public CoordinacionIdioma(JefeArea jefe,Docente docente, Asistente asistente ) {
		this.jefe = new JefeArea(null, null, null, null, null, null, null, null, null, null, null);
		this.docente = new ArrayList<Docente>();
		this.asistente= new ArrayList<Asistente>();
	}
}
