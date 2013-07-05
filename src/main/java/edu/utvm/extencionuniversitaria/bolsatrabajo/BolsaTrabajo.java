package edu.utvm.extencionuniversitaria.bolsatrabajo;
import edu.utvm.departamentofinanza.departamentopersonal.JefeArea;

public class BolsaTrabajo {
	public JefeArea JefeArea;

	public SeguimientoEgresados seguimientoEgresado;
	public InstitucionVinculada institucionVinculada;

	       public BolsaTrabajo(){
	    	   
	     seguimientoEgresado  = new SeguimientoEgresados();
	     institucionVinculada = new InstitucionVinculada();
	}
	       public BolsaTrabajo (SeguimientoEgresados seguimientoEgresado,InstitucionVinculada institucionVinculada){
	       
	       this.seguimientoEgresado =new SeguimientoEgresados();
	       
	       }
	       
	       
		public void registra(){
		}
			public void contacta(){
			}
				public void actualiza(){
				}

}
