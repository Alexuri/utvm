package main.java.edu.utvm.ActividadesCulturales;
import edu.utvm.desarrolloacademico.serviciosestudiantiles;
import edu.utvm.departamentofinanza.departamentopersonal;
import java.util.*;

  public class Actividad{
		public String tipoActividad;
		public List <Clase> clase; //ArrayList
	
		public Actividad(){
		clase =new ArrayList <Clase>();		
		}

			public Instructor instructor;
			public FormatoRegistro formatoRegistro;
			public alumno alumno;

		public List <Alumno> alumno; //----->ArrayList

		public Actividad(){
		alumno =new ArrayList <Alumno>();		
		}


}
