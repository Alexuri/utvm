package edu.utvm.desarrolloacademico.serviciosestudiantiles;

import java.util.ArrayList;

import edu.utvm.departamentofinanza.departamentopersonal.Psicologo;

public class Beca {

	String idBeca;
	String descripcion;
	double montoBeca;
	Requisito requisito;
	public ArrayList<Psicologo> psicologo;

	public Beca(String idBeca, String descripcion, double montoBeca,Requisito requisito, ArrayList<Psicologo> psicologo) {
		psicologo = new ArrayList<Psicologo>();
		this.idBeca=idBeca;
		this.descripcion=descripcion;
		this.montoBeca=montoBeca;
		this.requisito=requisito;
	}

	public void recepcionSolicitud() {

	}

	public void envioSolicitud() {

	}

	public void informarResultadoAlumno() {

	}

	public void verificarPromedio() {

	}

	public void notificarBajas() {

	}

	public void renovacionBecas() {

	}
}
