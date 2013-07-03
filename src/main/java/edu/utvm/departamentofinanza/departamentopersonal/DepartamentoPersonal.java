package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.*;

public class DepartamentoPersonal{
  public List<Empleado> empleados;
	public Contratacion contratacion;
	public Capacitacion capacitacion;
	public JefeArea jefeDepartamentoPersonal;
	
	public DepartamentoPersonal(){
		empleados = new ArrayList<Empleado>(){
	
		}
		this.contratacion = new Contratacion;
		this.capacitacion = new Capacitacion;
		this.jefeDepartamentoPersonal = new JefeArea;
	}
	
}
