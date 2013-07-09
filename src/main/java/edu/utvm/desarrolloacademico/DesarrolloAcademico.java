package edu.utvm.desarrolloacademico;

import edu.utvm.desarrolloacademico.coordinacioncontinua.DireccionEducacionContinua;
import edu.utvm.desarrolloacademico.coordinacionidiomas.CoordinacionIdioma;
import edu.utvm.desarrolloacademico.serviciosestudiantiles.ServicioEstudiantil;
import edu.utvm.desarrolloacademico.serviciosmedicos.ServicioMedico;

public class DesarrolloAcademico {

  public CoordinacionIdioma coordinacionIdioma;
	public ServicioEstudiantil servicioEstudiantil;
	public ServicioMedico servicioMedico;  	
	public DireccionEducacionContinua direccionEducacionContinua;
	
	public DesarrolloAcademico(){
		coordinacionIdioma = new CoordinacionIdioma();
		servicioEstudiantil = new ServicioEstudiantil(null, null);
		servicioMedico = new ServicioMedico(null, null, null);
		direccionEducacionContinua = new DireccionEducacionContinua(null, null); 
		
	}
}
