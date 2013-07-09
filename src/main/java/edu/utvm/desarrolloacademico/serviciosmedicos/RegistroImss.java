package edu.utvm.desarrolloacademico.serviciosmedicos;

import java.util.Date;

import edu.utvm.departamentofinanza.departamentopersonal.*;
import edu.utvm.subdireccionplaneacion.serviciosescolares.*;

public class RegistroImss {
	private Alumno alumno;
	private Empleado empleado;
	public String numeroAfiliacion;

	public RegistroImss(Alumno alumno, String numeroAfiliacion) {
		this.setAlumno(alumno);
		this.numeroAfiliacion = numeroAfiliacion;
	

	}

	public RegistroImss(Empleado empleado, String numeroAfiliacion) {
		this.setEmpleado(new Empleado(null, null, null, new Date(), null, null,
				null, null, null, null));
		this.numeroAfiliacion = numeroAfiliacion;
	
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	

}
