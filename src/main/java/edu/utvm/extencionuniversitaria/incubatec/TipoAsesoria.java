package edu.utvm.extencionuniversitaria.incubatec;

public class TipoAsesoria {
	public String mercadotecnia;
	public String administracion;
	public String procesosProductivos;
	public String financieros;
	public String diseniografico;
	public String aspectojuridico;
	
	public TipoAsesoria(){
	}
	
		public TipoAsesoria (String merc, String admin, String proc, String finan, String dis, String asp){
			this.mercadotecnia=merc;
			this.administracion=admin;
			this.procesosProductivos=proc;
			this.financieros=finan;
			this.diseniografico=dis;
			this.aspectojuridico=asp;
	}

}
