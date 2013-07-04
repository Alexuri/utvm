package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.*;

public class DepartamentoPersonal{
  	private List<Empleado> empleados;
  	private Contratacion contratacion;
  	private Capacitacion capacitacion;
  	private JefeArea jefeDepartamentoPersonal;
	
  	
	public DepartamentoPersonal(){
		empleados = new ArrayList<Empleado>();
		this.contratacion = new Contratacion();
		this.capacitacion = new Capacitacion();
		this.jefeDepartamentoPersonal = new JefeArea(null, null, null, null, null, null, null, null, null, null, null);
	}
	
}
