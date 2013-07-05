package edu.utvm.subdireccionplaneacion.programacionpresupuesto;
import  edu.utvm.departamentofinanza.departamentopersonal.JefeArea;
import java.util.*;

public class ProgramacionPresupuesto{
	public JefeArea jefeDeArea;
    public List<Carpetas>carpetas;
    
    public ProgramacionPresupuesto(){
		carpetas=new ArrayList<Carpetas>();
		
    }
		
	public void JefeArea(){
		JefeArea x = new JefeArea();
		x.realizaActividades();
		System.out.println(x);	
    }
	
}
