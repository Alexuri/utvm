package edu.utvm.desarrolloacademico.serviciosmedicos;

import java.util.Date;

import edu.utvm.departamentofinanza.departamentopersonal.*;
import edu.utvm.subdireccionplaneacion.serviciosescolares.*;

public class RegistroImss {
	private Alumno alumno;
	private Empleado empleado;
	String numeroAfiliacion;

	public RegistroImss(Alumno alumno, String numeroAfiliacion) {
		this.alumno = new Alumno(numeroAfiliacion);
		this.numeroAfiliacion = numeroAfiliacion;

	}

	public RegistroImss(Empleado empleado, String numeroAf) {
		this.empleado = new Empleado(null, null, null, new Date(), null, null,
				null, null, null, null);
		this.numeroAfiliacion = numeroAfiliacion;
	}

}
