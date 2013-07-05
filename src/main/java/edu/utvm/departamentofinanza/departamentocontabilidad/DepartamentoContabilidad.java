package edu.utvm.departamentofinanza.departamentocontabilidad;
import package edu.utvm.departamentofinanza.departamentopersonal.*;

public class DepartamentoContabilidad{
	
	public JefeArea jefeArea;
	
	public Asistente asistente;
	
	public Caja caja;

	public DepartamentoContabilidad(){
		this.caja = caja();
		this.asistente = asistente();
		this.jefeArea = jefeArea();
	}
	
	public void realizacontroldepago(){
	
	}
}
