package edu.utvm.rectoria;

import edu.utvm.departamentofinanza.*;
import edu.utvm.desarrolloacademico.*;
import edu.utvm.direccioncarrera.*;
import edu.utvm.extencionuniversitaria.*;
import edu.utvm.subdireccionplaneacion.*;

public class Universidad {
	private Rectoria rectoria;
	private DepartamentoFinanza departamentofinanza;
	private DesarrolloAcademico desarrolloAcademico;
	private DireccionCarrera direccionCarrera;
	private ExtencionUniversitaria extencionUniversitaria;
	private SubdireccionPlaneacion subdireccionPlaneacion;

	public Universidad(Rectoria rectoria,
			DepartamentoFinanza departamentofinanza,
			DesarrolloAcademico desarrolloAcademico,
			DireccionCarrera direccionCarrera,
			ExtencionUniversitaria extencionUniversitaria,
			SubdireccionPlaneacion subdireccionPlaneacion) {
		// Inicializa todos los departamentos y direcciones

		this.rectoria = new Rectoria(direccionCarrera);
		this.departamentofinanza = new DepartamentoFinanza();
		this.desarrolloAcademico = new DesarrolloAcademico();
		this.direccionCarrera = new DireccionCarrera();
		this.extencionUniversitaria = new ExtencionUniversitaria();
		this.subdireccionPlaneacion = new SubdireccionPlaneacion();

	}

	public static void main(String[] args) {
		//Universidad universidad = new Universidad(null, null, null, null, null, null);
		
	
		
	}

}
