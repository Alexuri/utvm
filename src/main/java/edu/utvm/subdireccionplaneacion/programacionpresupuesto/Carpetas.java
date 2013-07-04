package edu.utvm;
import java.util.*;
class Carpetas{
	
	public TipoDocumento tipodocumento;
	public String nombre;
	public Date fecha;
	public Manuales manuales;
	public Procedimientos proceimientos;
	public Presupuestos presupuestos;
	public List<Manuales>manuales;
		Manuales = new ArrayList<manuales>();
	public List<Procedimientos>procedimientos;
		Procedimientos = new ArrayList<procedimientos>();
	public List<Presupuestos>presupuestos;
		Presupuestos = new ArrayList<presupuestos>();
	
	public Carpetas(int folio, String nombre, String fechaElaboracion, String Clasificacion){
		this.tipodocumento=new TipoDocumento();
	  }
	  
	 
}
