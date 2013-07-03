package edu.utvm;
public class DireccionEducacionContinua{
	private String titular;
	private String telefono;
	private String ubicacion;
	private String horario;
	private String extension,
	private String email;

	private Cursos cursos;
	private Formatos formato;

	public DireccionEducacionContinua(Cursos cursos,Formatos formato){
		this.cursos = new Cursos();
		this.formato = new Formato();
	}
	public void detectarNecesidad(){
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
	public DireccionEducacionContinua(){
		this.cursos = new Cursos();
		this.formato = new Formato();
	}
}
