package prueba;

public class Departamento {
	private String nombreDepartamento;
	private int telefono=10;
	
	public Departamento(String nombreDepartamento, int telefono) {
		this.nombreDepartamento=nombreDepartamento;
		this.telefono=telefono;
	}
	
	public String toString(){
		
		return String.format("Departamento %s-%s",nombreDepartamento,telefono);
	}

}
