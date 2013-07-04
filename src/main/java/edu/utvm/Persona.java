package edu.utvm;
import java.util.*;

/*
 * Esto es un comentario
 * */

public class Persona {
  	private String nombre;
  	private String apellidoPaterno;
  	private String apellidoMaterno;
  	private Date fechaNacimiento;
  	private String rfc;
  	private String curp;
  	private String direccion;
	private String correo;
	private String telefono;
	
	public Persona(String nom, String apPat, String apMat, Date fechaNac, String rfc, String curp, String direc, String correo, String tel){
		this.nombre = nom;
		this.apellidoPaterno = apPat;
		this.apellidoMaterno = apMat;
		this.fechaNacimiento = fechaNac;
		this.rfc = rfc;
		this.curp = curp;
		this.direccion = direc;
		this.correo = correo;
		this.telefono = tel; 
	}
}
