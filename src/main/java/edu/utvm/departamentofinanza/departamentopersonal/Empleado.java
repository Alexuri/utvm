package edu.utvm.departamentofinanza.departamentopersonal;
import edu.utvm.Persona;
import java.util.Date;

public class Empleado extends Persona {
	protected String claveEmpleado;
	
	public String getClaveEmpleado() {
		return claveEmpleado;
	}



	public void setClaveEmpleado(String claveEmpleado) {
		this.claveEmpleado = claveEmpleado;
	}



	public Empleado(String nom, String apPat, String apMat, Date fechaNac, String rfc, String curp, String direc, String correo, String tel, String claveEmpleado) {
		super(nom, apPat, apMat, fechaNac, rfc, curp, direc, correo, tel);
		this.claveEmpleado=claveEmpleado;
		
	}// constructor empleado
	


		
}
