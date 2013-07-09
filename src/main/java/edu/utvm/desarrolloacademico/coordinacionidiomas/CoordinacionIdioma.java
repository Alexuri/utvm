package edu.utvm.desarrolloacademico.coordinacionidiomas;
import java.util.ArrayList;
import java.util.List;

import edu.utvm.departamentofinanza.departamentopersonal.*;
public class CoordinacionIdioma {

  	private JefeArea jefe;
	private List<Docente> docente;
	private List<Asistente> asistente;

	public CoordinacionIdioma() {
		setJefe(new JefeArea(null, null, null, null, null, null, null, null, null, null, null));
		setDocente(new ArrayList<Docente>());
		setAsistente(new ArrayList<Asistente>());
	}

	public JefeArea getJefe() {
		return jefe;
	}

	public void setJefe(JefeArea jefe) {
		this.jefe = jefe;
	}

	public List<Docente> getDocente() {
		return docente;
	}

	public void setDocente(List<Docente> docente) {
		this.docente = docente;
	}

	public List<Asistente> getAsistente() {
		return asistente;
	}

	public void setAsistente(List<Asistente> asistente) {
		this.asistente = asistente;
	}
}

