package edu.utvm.desarrolloacademico.serviciosmedicos;

import edu.utvm.departamentofinanza.departamentopersonal.*;
import java.util.ArrayList;

public class ServicioMedico {
	String salaEspera;
	String salaConsulta;
	public ArrayList<PersonalMedico> personalMedico;

	public ServicioMedico(String salaEspera, String SalaConsulta,
			ArrayList<PersonalMedico> personalMedico) {
		this.personalMedico = new ArrayList<PersonalMedico>();
	}

	public void atencionMedica() {

	}
}


