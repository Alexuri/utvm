package edu.utvm.rectoria

public class Rectoria {

	private Rector rector;
	private SecretariaRector secretariarector;
	private Personal personal;

	public Rectoria() {
		this.rector = new Rector();
		this.secretariarector = new secretariarector();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectoria cuenta con %s y %s",rector,secretariarector);
	}
}
