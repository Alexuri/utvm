package edu.utvm.departamentofinanza.departamentomantenimiento;
import edu.utvm.departamentofinanza.departamentopersonal.*;

public class DepartamentoMantenimiento{
	public JefeArea jefeArea;
	public Asistente asistente;
	public PersonalLimpieza personalLimpieza;
	public PersonalSeguridad personalSeguridad;
	
	public DepartamentoMantenimiento(JefeArea jefeArea, Asistente asistente, PersonalLimpieza personalLimpieza, PersonalSeguridad personalSeguridad){
		this.jefeArea=new JefeArea(null,null,null,null,null,null,null,null,null,null,null);		
		this.asistente=new Asistente(null,null,null,null,null,null,null,null,null,null,null);
		this.personalLimpieza=new PersonalLimpieza();
		this.personalSeguridad=new PersonalSeguridad();
	}
}
