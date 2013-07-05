package edu.utvm.desarrolloacademico.coordinacioncontinua;
import edu.utvm.general.Persona;

public class Participante {

	private String escolaridad;
	private String tipoParticipante;
	
	public Participante (String escolaridad,String tipoParticipante){
		this.setEscolaridad(escolaridad);
		this.setTipoParticipante(tipoParticipante);
	
	}
	public void setEscolaridad(String escolaridad){
		this.escolaridad = escolaridad;
	}
	public String getEscolaridad(){
		return this.escolaridad;
	}
	
	public void setTipoParticipante(String tipoParticipante){
		this.tipoParticipante = tipoParticipante;
	}
	public String getTipoParticipante(){
		
		return this.tipoParticipante;
	}
		
	public void elegirCurso(){
	}
	public void asistirCurso(){
	}
	public void pagarCurso(){
	}
	public void evaluarFacilitador(){
	}
	public void evaluarCurso(){
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Docentes");
	}
}

