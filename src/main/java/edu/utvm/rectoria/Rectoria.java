package edu.utvm.rectoria;

import java.util.*;

//llamando clases

import edu.utvm.departamentofinanza.departamentopersonal.Rector;
import edu.utvm.departamentofinanza.departamentorecursos.Departamento;
import edu.utvm.direccioncarrera.DireccionCarrera;

public class Rectoria {

	private Rector rector;
	private DireccionCarrera direccionCarrera;

	public Rectoria(Rector rector) {
		this.rector = new Rector("nom", "apPat", "apMat", null, "rfc", "curp",
				"direc", "correo", "tel", "claveEmpleado", "cedulaProfesional");

	}

	public Rectoria(DireccionCarrera direccionCarrera) {
		this.direccionCarrera = new DireccionCarrera();

	}
		
		
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectoria cuenta con %s y %s", rector);
	}

	//metodos de rectoria
	
	public void atencionllamadastelefonicas() {

	}

	public void atencionvisitas() {

	}

	public void visitasacarreras() {

	}

	public void Atencionllamadastelefonicas() {

	}

	public void cordinacioncarrerascarreras() {

	}

	protected void reportarConsjeoDirectivo() {

	}

	protected void supervisarDirectoresdePE() {

	}

	protected void supervisarDirectordeAdministraciondeFinanzas() {

	}

	protected void representarLaUniversidad() {

	}

	protected void ejecutarDisposicionesdeConsejoDirectivo() {

	}

	protected void establecerMecanismosdeEvaluacionqueDestaquenEficienciayEficacia() {

	}

	protected void llevarAcaboActosDeAdministracion() {

	}

	protected void formularInstituciondeDesarrollo() {

	}

	protected void recabarInformacionYElementosEstadisticos() {

	}

	protected void dirigirDesarrollodeActividadesTecnicas() {

	}

}
