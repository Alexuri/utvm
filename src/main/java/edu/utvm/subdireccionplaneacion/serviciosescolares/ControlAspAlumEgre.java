package edu.utvm.subdireccionplaneacion.serviciosescolares;

public class ControlAspAlumEgre{

  public Alumno alumno;
	public Aspirante aspirante;
	public Egresado egresado;

	public ControlAspAlumEgre(){
		
		Alumno alumno = new Alumno(null);
		Aspirante aspirante = new Aspirante(null, null, null, null, null);
		Egresado egresado = new Egresado();
	}
}
