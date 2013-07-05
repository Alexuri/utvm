package edu.utvm.extencionuniversitaria.incubatec;
import edu.utvm.departamentofinanza.departamentopersonal.*;
import edu.utvm.extencionuniversitaria.subdireccioninvestigacion.departamentogestiontecnologica.*;

public class IncubatecUtvm {

			public Asesorias asesorias;
			public  Apoyo    apoyo;
			public Proyecto   proyecto;
			public ServicioTecnologico    sevicioTecnologico;
			public JefeArea    jefeArea;
			public Emprendedor emprendedor;
			
			public IncubatecUtvm(){

		this.asesorias = new Asesorias();
		this.apoyo = new Apoyo();
		this.proyecto= new Proyecto();
		this.emprendedor= new Emprendedor();
		}

			public void orientacionPublica(){
			}
			public void realizarPlanNegocio(){
			}
			public void creaEmpresa(){
			
		}

}
