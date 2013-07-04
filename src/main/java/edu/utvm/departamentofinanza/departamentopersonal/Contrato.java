package edu.utvm.departamentofinanza.departamentopersonal;
import edu.utvm.general.Persona;
import java.util.*;

public class Contrato{
	public Persona persona;
	private String clausulas;
	private Date fechaInicio;
	private Date fechaTermino;
	
	public Contrato(Persona per, String clau, Date fechaIni, Date fechaFin){
		this.persona = per;
		this.clausulas = clau;
		this.fechaInicio = fechaIni;
		this.fechaTermino = fechaFin;
	}
	
}
