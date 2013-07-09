

package edu.utvm.extencionuniversitaria.subdireccioninvestigacion.departamentogestiontecnocientifica;
import java.util.*;

	public class VisitasGuiadas{
		public String guia;
		public Date fechaVisita;
		public int horaVisita;
		public String organizacion;
		public String asistentes;

			public VisitasGuiadas(String guia, Date fechaVisita, int horaVisita, String organizacion, String asistentes){

				
				this.guia = guia;
				this.fechaVisita = fechaVisita;
				this.horaVisita = horaVisita;
				this.organizacion = organizacion;
				this.asistentes = asistentes;
				
			}
	}
