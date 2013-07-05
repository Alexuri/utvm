package edu.utvm.desarrolloacademico.coordinacioncontinua;
import java.util.*;
public class Formatos{
	private String tipo;
	private Date fecha;
	private int folio;
	private String vistoBueno;

	public Formatos( String tipo, Date fecha, int folio,String vistoBueno){
		this.tipo = tipo;
		this.fecha = fecha;
		this.folio = folio;
		this.vistoBueno = vistoBueno;
	}
}
