package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.Date;

public class Instructor extends Administrativo{

	public Instructor(String nom, String apPat, String apMat, Date fechaNac, String rfc, String curp, String direc, String correo, String tel, String claveEmpleado, String cedulaProfesional) {
		super(nom, apPat, apMat, fechaNac, rfc, curp, direc, correo, tel,
				claveEmpleado, cedulaProfesional);
		
	}//Constructor Instructor

	public void entrenar(){
	
	}
	
	
}
