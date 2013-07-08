package edu.utvm.extencionuniversitaria.actividadesculturales;

import edu.utvm.extencionuniversitaria.actividadesculturales.Actividad;
import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;

public class ActividadesCulturales {
	public JefeArea jefeArea;
	public Actividad actividad;

	public ActividadesCulturales() {
		this.actividad = new Actividad();

	}

	public void JefeArea() {
		this.jefeArea = new JefeArea(null, null, null, null, null, null, null,
				null, null, null, null);
	}
}
