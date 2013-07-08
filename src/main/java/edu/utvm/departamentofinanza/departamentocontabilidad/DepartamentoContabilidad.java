package edu.utvm.departamentofinanza.departamentocontabilidad;
import  edu.utvm.departamentofinanza.departamentopersonal.*;

public class DepartamentoContabilidad{
	
	public JefeArea jefeArea;
	
	public Asistente asistente;
	
	public Caja caja;

	public DepartamentoContabilidad(JefeArea jefeArea,Asistente asistente,Caja caja){
		this.caja = caja(null,null,null);
		this.asistente = asistente(null,null,null,null,null,null,null,null,null,null,null);
		this.jefeArea = jefeArea(null,null,null,null,null,null,null,null,null,null,null);
	}
	
	public void RealizaControlPago(){
	
	}
}
