package edu.utvm.extencionuniversitaria.incubatec;

public class Empresa implements Desarrolla{
	public String nombre;
	public String direccion;
	public int telefono;
	public TipoEmpresa tipoEmpresa;

	public Empresa() {
	}

	public Empresa(String nom, String dir, int tel, String tip) {
		this.nombre = nom;
		this.direccion = dir;
		this.telefono = tel;
		this.tipoEmpresa = new TipoEmpresa();
	}

	public void desrrollarempresa() {
	}

	public void desarrollaProyecto() {
	}


}
