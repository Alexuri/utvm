package edu.utvm.departamentofinanza.departamentocontabilidad;
import package edu.utvm.departamentofinanza.departamentopersonal.Asistente;
import package edu.utvm.departamentofinanza.departamentopersonal.Jefearea;

public class DepartamentoContabilidad{
  public JefeArea jefeArea;
	public Asistente asistente;
	public Caja caja;

	public DepartamentoContabilidad(){
		this.caja = new Caja();
		this.Asistente = new asistente();
		this.JefeArea = new jefeArea();
	}
        
}
