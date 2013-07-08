package edu.utvm.extencionuniversitaria.prensadifusion;

import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;

 public class PrensaDifusion{
		
	public JefeArea jefeArea;
	public Disenio disenio;
	public Logistica logistica;
	public MediosDifusion mediosDifusion;
	public RedesSociales redesSociales;
	public String Promocion;
	public String ActividadInstituto;
	
	public PrensaDifusion(String prom, String actinst){
		this.Promocion = prom;
		this.ActividadInstituto= actinst;
	}
	
	public void difundirInformacion(){
	}
	public void diseniar(){
	}
}
