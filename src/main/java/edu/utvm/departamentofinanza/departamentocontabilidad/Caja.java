package edu.utvm.departamentofinanza.departamentocontabilidad;
import edu.utvm.departamentofinanza.departamentocontabilidad.ReciboPago;
public class Caja {
	
	public ReciboPago reciboPago;
	
	public Float dinero;
	
	public String alumno; 
	
	public Caja (RecibiPago reciboPago, Float dinero, String alumno){
		this.reciboPago = reciboPago;
		this.dinero = dinero;
		this.alumno = alumno;
	}
	
	public void reciboDinero(){
		
	}
}
