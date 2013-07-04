package edu.utvm.departamentofinanza.departamentomantenimiento;
import edu.utvm.departamentofinanza.departamentopersonal.JefeDepartamento;

public class DepartamentoMantenimiento{
	public JefeDepartamento jefeDepartamento;
	public Asistente asistente;
	public PersonalLimpieza personalLimpieza;
	public PersonalSeguridad personalSeguridad;
	
	public DepartamentoMantenimiento(JefeDepartamento jefeDepartamento, Asistente asistente, PersonalLimpieza personalLimpieza, PersonalSeguridad personalSeguridad){
		this.jefeDepartamento=new JefeDepartamento();		
		this.asistente=new Asistente();
		this.personalLimpieza=new PersonalLimpieza();
		this.personalSeguridad=new PersonalSeguridad();
	}
}
