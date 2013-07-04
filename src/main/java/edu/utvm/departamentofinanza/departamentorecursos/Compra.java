package edu.utvm.departamentofinanza.departamentorecursos;

public class Compra {
	private int numCompra;
	private int clave;
	private String descripcion;
	
	public Compra(int numCompra, int clave, String descripcion ) {
		// TODO Auto-generated constructor stub
		this.numCompra=numCompra;
		this.clave=clave;
		this.descripcion=descripcion;
	}
	public String toString(){
		return String.format("compra %s-%s-%s",numCompra,clave,descripcion);
	}

}
