package edu.utvm.subdireccionplaneacion.programacionpresupuesto;
import java.util.*;



public class Carpetas{
	
	public TipoDocumento tipoDocumento;
	public String nombre;
	public Date fecha;
	public List<Manuales>manuales;
	public List<Procedimientos>procedimientos;
	public List<Presupuestos>presupuestos;
	
	public Carpetas(int folio, String nombre, String fechaElaboracion, String Clasificacion){
		
		manuales = new ArrayList<Manuales>();
		procedimientos = new ArrayList<Procedimientos>();		
		presupuestos = new ArrayList<Presupuestos>();
		
		this.tipoDocumento=new TipoDocumento();
		
		
	}	  
	 
}
