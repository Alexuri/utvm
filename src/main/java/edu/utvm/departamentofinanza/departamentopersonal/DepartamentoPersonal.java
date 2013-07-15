package edu.utvm.departamentofinanza.departamentopersonal;
import java.util.*;

import edu.utvm.departamentofinanza.departamentorecursos.Compra;
import edu.utvm.departamentofinanza.departamentorecursos.Departamento;

public class DepartamentoPersonal{
	private Empleado empleado;
  	private List<Empleado> empleados;
  	private Contratacion contratacion;
  	private Capacitacion capacitacion;
  	private JefeArea jefeDepartamentoPersonal;
	
  	
	public DepartamentoPersonal(){
		empleados = new ArrayList<Empleado>();
		this.contratacion = new Contratacion();
		this.capacitacion = new Capacitacion();
		this.jefeDepartamentoPersonal = new JefeArea(null, null, null, null, null, null, null, null, null, null, null);
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Construyendo la clase Administrativo");
		System.out.println("Construyendo la clase Asistente");
		System.out.println("Construyendo la clase capacitacion ");
		System.out.println("Construyendo la clase contratacion");
		System.out.println("Construyendo la clase contrato");
		System.out.println("Construyendo la clase coordinacion de desarrollo academico");
		System.out.println("Construyendo la clase Director");
		System.out.println("Construyendo la clase Docente");
		System.out.println("Construyendo la clase Empelado");
		System.out.println("Construyendo la clase Instructor");
		System.out.println("Construyendo la clase Jefe Area");
		System.out.println("Construyendo la clase Personlal Medico");
		System.out.println("Construyendo la clase Psicologo");
		System.out.println("Construyendo la clase Rector");
		System.out.println("Construyendo la clase Responsable de Laboratorio");
		
	}*/

}

	


