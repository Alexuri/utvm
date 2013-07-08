package edu.utvm.direccioncarrera.carrera;
import edu.utvm.subdireccionplaneacion.serviciosescolares.Alumno;
import edu.utvm.departamentofinanza.departamentopersonal.Asistente;
import edu.utvm.departamentofinanza.departamentopersonal.Docente;
import edu.utvm.direccioncarrera.Laboratorio;


public class  Carrera{
	
	public String planEstudio;
	public String horario;
	public int grado;
	public String grupo;
	public String ubicacion;
	public String NombreCarrera;
	
	public Alumno alumno;
	public Asistente asistente;
	public Docente docente;
	public Laboratorio laboratorio; 
		
		public Carrera(){
			this.alumno = new Alumno("103186");
			this.asistente = new Asistente(NombreCarrera, NombreCarrera, NombreCarrera, null, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera);
			this.docente = new Docente(NombreCarrera, NombreCarrera, NombreCarrera, null, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera, NombreCarrera);
			this.laboratorio = new Laboratorio();
				
		}
}


