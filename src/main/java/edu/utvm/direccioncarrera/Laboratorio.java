package edu.utvm.direccioncarrera;
import edu.utvm.departamentofinanza.departamentopersonal.ResponsableLaboratorio;

public class Laboratorio{

  	public String nombre;
	public String ubicacion;
	public String equipos;
	public String responsableLaboratorio;
	
		public Laboratorio(){
		
			this.responsableLaboratorio = new ResponsableLaboratorio();
		
		}
} 
