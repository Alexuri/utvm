package edu.utvm.desarrolloacademico.serviciosmedicos;

import edu.utvm.departamentofinanza.departamentopersonal.*;
import java.util.List;
import java.util.ArrayList;

public class ServicioMedico {
	String salaEspera;
	String salaConsulta;
	public RegistroImss registroImss;
	public ArrayList<PersonalMedico> personalMedico;

	public ServicioMedico(String salaEspera, String SalaConsulta,
			ArrayList<PersonalMedico> personalMedico) {
		this.personalMedico = new ArrayList<PersonalMedico>();
		this.registroImss = new RegistroImss(new Alumno(null), null);
		this.registroImss = new RegistroImss(new Empleado(null, null, null, null, null, null, null, null, null, null), null);
	}

	public void atencionMedica() {
		

	}
}





