package edu.utvm;
import java.util.*;

public class Persona {
  	public String nombre;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public Date fechaNacimiento;
	public String rfc;
	public String curp;
	public String direccion;
	public String correo;
	public String telefono;
	
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
