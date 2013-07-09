package edu.utvm.direccioncarrera.carrera;

public class Departamento {
	public Redes redes;
	public Sistemas sistemas;
	public Soporte soporte;

	public Departamento() {

		redes = new Redes();
		sistemas = new Sistemas();
		soporte = new Soporte();
	}

}
