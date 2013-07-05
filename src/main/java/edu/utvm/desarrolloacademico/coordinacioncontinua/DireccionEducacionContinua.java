package edu.utvm.desarrolloacademico.coordinacioncontinua;
import edu.utvm.desarrolloacademico.coordinacioncontinua.*;

public class DireccionEducacionContinua{
	private String titular;
	private String telefono;
	private String ubicacion;
	private String horario;
	private String extension;
	private String email;

	private Cursos cursos;
	private Formatos formato;
	
	
	

	public DireccionEducacionContinua(Cursos cursos,Formatos formato){
		this.cursos = new Cursos (null, null, 0, 0, email);
		this.formato = new Formatos (email, null, 0, email);
	}
	
	public void detectarNecesidades(){
	}
	public void registrarParticipante(){
	}
	public void analizarSolicitud(){
	}
	public void recibirEvidencia(){
	}
	public void elaborarConstancia(){
	}
	public void entregarConstancia(){
	}
	public void contratarFacilitador(){
	}
	public void evaluarFacilitador(){
	}
		
}