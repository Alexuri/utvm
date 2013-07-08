package edu.utvm.departamentofinanza.departamentocontabilidad;
import  edu.utvm.departamentofinanza.departamentopersonal.*;

public class DepartamentoContabilidad{
	
	public JefeArea jefeArea;
	
	public Asistente asistente;
	
	public Caja caja;

	public DepartamentoContabilidad(JefeArea jefeArea,Asistente asistente,Caja caja){
		this.caja = new Caja(null,null,null);
		this.asistente =new Asistente(null,null,null,null,null,null,null,null,null,null,null);
		this.jefeArea = new JefeArea(null,null,null,null,null,null,null,null,null,null,null);
	}
	
	public void RealizaControlPago(){
	
	}
}
