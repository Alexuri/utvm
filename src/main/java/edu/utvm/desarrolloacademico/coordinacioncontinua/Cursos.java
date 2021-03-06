package edu.utvm.desarrolloacademico.coordinacioncontinua;
import edu.utvm.departamentofinanza.departamentopersonal.Docente;
import edu.utvm.general.Persona;


public class Cursos{
	private int numeroCurso;
	private int duracion;
	private String programaEducativo;
	private Participante participante;
	private Docente docente;
	
	public Cursos(Participante participante, Docente docente,int numeroCurso, int duracion,String programaEducativo){
		this.participante = new Participante(programaEducativo, programaEducativo);
		this.docente = new Docente(programaEducativo, programaEducativo, programaEducativo, null, programaEducativo, programaEducativo, programaEducativo, programaEducativo, programaEducativo, programaEducativo);
		
		
		this.setduracion(duracion);
		this.setprogramaEducativo(programaEducativo);
		this.setnumeroCurso(numeroCurso);
	
	}
	public void setnumeroCurso(int numeroCurso){
		this.numeroCurso = numeroCurso;
	}
	public int getnumeroCurso(){
		return this.numeroCurso;
	}
	public void setduracion(int duracion){
		this.duracion = duracion;
	}
	public int getduracion(){
		return this.duracion;
	}
	public void setprogramaEducativo(String programaEducativo){
		this.programaEducativo = programaEducativo;
	}
	public String getprogramaEducativo(){
		return this.programaEducativo;
	}
	
		
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("cursos");		
	}
}

