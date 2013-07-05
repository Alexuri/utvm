
package edu.utvm.extencionuniversitaria.subdireccioninvestigacion.departamentogestiontecnocientifica;
import java.util.*;
	
	public class Registro{
		public int claveUsuario;
		public Date fechaPrestamo;
		public Date fechaEntrega;
		public String deudas;
		public String tipoMaterial;
			
			public Registro (int claveusuario, Date fechaprestamo, Date fechaentrega, String deuda, String tipomaterial){
	
				this.claveUsuario = claveusuario;
				this.fechaPrestamo = fechaprestamo;
				this.fechaEntrega = fechaentrega;
				this.deudas = deuda;
				this.tipoMaterial = tipomaterial;
				
			}
	
	}
