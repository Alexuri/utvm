public class CoordinacionDeIdiomas {

	private JefeDeArea jefe;
	private Docente docente;
	private Personal personal;

	public CoordinacionDeIdiomas() {
		this.jefe = new JefeDeArea();
		this.docente = new Docente();
		this.personal= new Personal();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Coordinacion De Idiomas, y esta Coordinacion tiene un %s, %s y %s",jefe,docente,personal);
	}
}
