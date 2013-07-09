package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.direccioncarrera.carrera.Carrera;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno.*;

public class CartaPresentacion{

  public int matricula;
	public Alumno alumno;
	public Carrera carrera;
	public String organizacion;
	public String fechaInicio;
	public String fechaFin;

	public CartaPresentacion(){
		
		Alumno alumno = new Alumno(null);
		Carrera carrera = new Carrera();
	}

}
