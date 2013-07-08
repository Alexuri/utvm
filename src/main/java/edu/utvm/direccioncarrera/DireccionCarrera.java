package edu.utvm.direccioncarrera;

import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;
import edu.utvm.direccioncarrera.carrera.Carrera;

public class DireccionCarrera {

	public Carrera carrera;
	public JefeArea jefeArea;

	public DireccionCarrera() {

		this.jefeArea = new JefeArea("Usiel", "Mendoza", "Arellano", null,
				"USI3423", "USI3423SFSD", "Ixmiquilpan",
				"umendoza@hotmail.com", "7721302519", "U123456", "FRSDF1234");
		this.carrera = new Carrera();
	}
}
