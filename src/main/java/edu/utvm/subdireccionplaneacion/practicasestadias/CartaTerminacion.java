package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.subdireccionplaneacion.practicasestadias.Organizacion;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;

public class CartaTerminacion{

  public String fecha;
	public Alumno alumno;
	public Organizacion organizacion;

	public CartaTerminazion(){
		
		Alumno alumno = new Alumno();
		Organizacion organizacion = new Organizacion();
	}

}
