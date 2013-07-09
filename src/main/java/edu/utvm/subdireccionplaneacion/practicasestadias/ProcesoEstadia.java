package edu.utvm.subdireccionplaneacion.practicasestadias;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;
import edu.utvm.subdireccionplaneacion.serviciosescolares.FichaRegistro;


public class ProcesoEstadia{

  public Alumno alumno;
	public FichaRegistro fichaRegistro;
	public CartaPresentacion cartaPresentacion;
	public CartaNoAdeudo cartaNoAdeudo;
	public String registroImss;

	public ProcesoEstadia(Alumno alumno,FichaRegistro ficheRegistro,CartaPresentacion cartapresentacion,CartaNoAdeudo cartaNoAdeudo){

		Alumno alum = new Alumno(null);
		FichaRegistro ficheReg = new FichaRegistro();
		CartaPresentacion cartapres = new CartaPresentacion();
 		CartaNoAdeudo cartaNoAdeudo1 = new CartaNoAdeudo(null, null);
	}


}
