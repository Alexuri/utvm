package edu.utvm.direccioncarrera;

import edu.utvm.departamentofinanza.departamentopersonal.ResponsableLaboratorio;

public class Laboratorio {

	public String nombre;
	public String ubicacion;
	public String equipos;
	public ResponsableLaboratorio responsableLaboratorio;

	public Laboratorio() {

		this.responsableLaboratorio = new ResponsableLaboratorio("Able",
				"Gonzalez", "Luna", null, "ABL3423", "ABL3423SFSD",
				"Alfajayucan", "agonzalez@hotmail.com", "2221251234",
				"U123456", "FRSDF1234");

	}
}
