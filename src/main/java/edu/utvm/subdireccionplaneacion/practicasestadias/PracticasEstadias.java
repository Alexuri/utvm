package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;


public class PracticasEstadias{

  	public ProcesoEstadia procesoEstadia;
	public VisitaIndustrial visitaIndustrial;
	public JefeArea jefeArea;

	public PracticasEstadias(ProcesoEstadia procesoEstadia,VisitaIndustrial visitaIndustrial,JefeArea jefeArea){
		ProcesoEstadia procesoEs = new ProcesoEstadia (null, null, null, null);
		VisitaIndustrial visitaIndus = new VisitaIndustrial(null);
		JefeArea jefeAr = new JefeArea(null, null, null, null, null, null, null, null, null, null, null);
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
