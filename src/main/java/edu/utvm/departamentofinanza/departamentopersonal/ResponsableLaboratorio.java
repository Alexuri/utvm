package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.Date;

public class ResponsableLaboratorio extends Administrativo{

	public ResponsableLaboratorio(String nom, String apPat, String apMat, Date fechaNac, String rfc, String curp, String direc, String correo, String tel, String claveEmpleado, String cedulaProfesional) {
		super(nom, apPat, apMat, fechaNac, rfc, curp, direc, correo, tel, claveEmpleado, cedulaProfesional);
	} //Constructor ResponsableLaboratorio

	public void darMantenimiento(){
	
	}
	
	public void registrarEquipoLaboratorio(){
	
	}

}
