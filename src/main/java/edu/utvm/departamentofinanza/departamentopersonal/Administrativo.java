package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.Date;

public class Administrativo extends Empleado{
	
	public String cedulaProfesional;

	public Administrativo(String nom, String apPat, String apMat, Date fechaNac, String rfc, String curp, String direc, String correo, String tel, String claveEmpleado, String cedulaProfesional) {
		super(nom, apPat, apMat, fechaNac, rfc, curp, direc, correo, tel, claveEmpleado);
		this.cedulaProfesional = cedulaProfesional;
	} //constructor administrativo

	

}
