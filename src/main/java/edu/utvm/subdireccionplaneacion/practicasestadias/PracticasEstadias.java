package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;

public class PracticasEstadias{

  	public ProcesoEstadia procesoEstadia;
	public VisitaIndustrial visitaIndustrial;
	public JefeArea jefeArea;

	public PracticasEstadias(ProcesoEstadia procesoEstadia,VisitaIndustrial visitaIndustrial,JefeArea jefeArea){
		ProcesoEstadia procesoEstadia = new ProcesoEstadia();
		VisitaIndustrial visitaIndustrial = new VisitaIndustrial();
		JefeArea jefeArea = new JefeArea();
	}

	
	
	public void GeneraCarta(){

	}

	public void GestionarVisita(){
	}

	public void GenerarMemorandumVisita(){
	}

	public void AltaEstadia(){
	}

	public void BajaEstadia(){
	}
}
