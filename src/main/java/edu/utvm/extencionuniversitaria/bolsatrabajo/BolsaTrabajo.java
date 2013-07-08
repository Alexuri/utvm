package edu.utvm.extencionuniversitaria.bolsatrabajo;

import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;

public class BolsaTrabajo {
	public JefeArea JefeArea;

	public SeguimientoEgresados seguimientoEgresados;
	public InstitucionVinculada institucionVinculada;

	public BolsaTrabajo() {

		seguimientoEgresados = new SeguimientoEgresados(null);
		institucionVinculada = new InstitucionVinculada();
	}

	public BolsaTrabajo(SeguimientoEgresados seguimientoEgresado,
			InstitucionVinculada institucionVinculada) {

		this.seguimientoEgresados = new SeguimientoEgresados(null);

	}

	public void registra() {
	}

	public void contacta() {
	}

	public void actualiza() {
	}

}

