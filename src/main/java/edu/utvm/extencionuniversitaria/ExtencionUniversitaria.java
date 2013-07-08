package edu.utvm.extencionuniversitaria;

import edu.utvm.extencionuniversitaria.actividadesculturales.*;
import edu.utvm.extencionuniversitaria.bolsatrabajo.*;
import edu.utvm.extencionuniversitaria.incubatec.*;
import edu.utvm.extencionuniversitaria.prensadifusion.*;
import edu.utvm.extencionuniversitaria.subdireccioninvestigacion.*;

public class ExtencionUniversitaria {

	public BolsaTrabajo bolsatrabajo;
	public IncubatecUtvm incubatec;
	public PrensaDifusion prensadifusion;
	public ActividadesCulturales actividadesculturales;
	public SubdireccionInvestigacion subdireccioninvestigacion;

	public ExtencionUniversitaria() {

		IncubatecUtvm x = new IncubatecUtvm();
		BolsaTrabajo y = new BolsaTrabajo();
		PrensaDifusion z = new PrensaDifusion(null, null);
		ActividadesCulturales w = new ActividadesCulturales();
		SubdireccionInvestigacion q = new SubdireccionInvestigacion();

	}
}
