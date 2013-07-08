package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno.*;
import edu.utvm.direccioncarrera.Carrera;

public class CartaPresentacion{

  public Int matricula;
	public Alumno alumno;
	public Carrera carrera;
	public String organizacion;
	public String fechaInicio
	public String fechaFin;

	public CartaPresentacion(){
		
		Alumno alumno = new Alumno();
		Carrera carrera = new Carrera();
	}

}
