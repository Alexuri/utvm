package main.java.edu.utvm.ActividadesCulturales;
import edu.utvm.departamentofinanza.departamentoplaneacion.serviciosescolares.Alumno;
import java.util.*;
  
	public class Clase{
		public Date dia;
		public DateTime hora;
		public String lugar;

		public List <Alumno> alumno;//---->ArrayList

		public Clase(){
		this.alumno = new ArrayList <Alumno>();
		}
	}
