package edu.utvm.extencionuniversitaria.incubatec;

public class TipoApoyo {
	
	public String talleres;
	public String laboratorios;
	public String enlaces;
	public String contactoempresa;
	public String vinculacion;
	
	public TipoApoyo(){
	}
		public TipoApoyo(String tall, String lab, String enl, String conc, String vin){
			this.talleres=tall;
			this.laboratorios=lab;
			this.enlaces=enl;
			this.contactoempresa=conc;
			this.vinculacion=vin;
	}
}


