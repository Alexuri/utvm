package edu.utvm.subdireccionplaneacion.serviciosescolares;
import edu.utvm.general.Persona;

public class Aspirante{

  public String folio;
	public String bachillerato;
	public Double promedio;
	public String programaEducativoAspirante;
	public Persona persona;
	

	public Aspirante(String folio, String bachillerato, Double promedio, String programaEducativoAspirante, Persona persona){
		
		Persona person = new Persona(programaEducativoAspirante, programaEducativoAspirante, programaEducativoAspirante, null, programaEducativoAspirante, programaEducativoAspirante, programaEducativoAspirante, programaEducativoAspirante, programaEducativoAspirante);
	}

	public void SolicitarInfo(){

	}

	public void PagarFicha(){

	}

	public void RecibirResultados(){

	}

	public void EntregaDocumentos(){

	}
	
}
