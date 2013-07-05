package edu.utvm.departamentofinanza.departamentocontabilidad;
import  edu.utvm.departamentofinanza.departamentopersonal.*;

public class DepartamentoContabilidad{
	
	public JefeArea jefeArea;
	
	public Asistente asistente;
	
	public Caja caja;

	public DepartamentoContabilidad(JefeArea jefeArea,Asistente asistente,Caja caja){
		this.caja = caja();
		this.asistente = asistente();
		this.jefeArea = jefeArea();
	}
	
	public void RealizaControlPago(){
	
	}
}
