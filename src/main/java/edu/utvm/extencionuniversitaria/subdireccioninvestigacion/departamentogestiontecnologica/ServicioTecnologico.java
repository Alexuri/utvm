package edu.utvm.extencionuniversitaria.subdireccioninvestigacion.departamentogestiontecnologica;

import java.util.*;
import edu.utvm.direccioncarrera.*;

public class ServicioTecnologico {

	public Carrera carrera;
	public TipoServicioTecnologico tipoServicio;
	public int folio;
	public Date fecha;

	public List<Carrera> Carrera;

	public ServicioTecnologico(int fol, Date fecha) {
		this.folio = fol;
		this.fecha = fecha;
	}

	ArrayList<Carrera> ServicioTecnologico = new ArrayList<Carrera>();

	public ServicioTecnologico() {

	}

	ServicioTecnologico servicioTecnologico = new ServicioTecnologico();

	public void checarProyecto() {

	}
}
