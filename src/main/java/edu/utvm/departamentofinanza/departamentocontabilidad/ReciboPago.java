package edu.utvm.departamentofinanza.departamentocontabilidad;

public class ReciboPago {
	public int folio;
	public String fecha; 
	public int matricula;
	public String concepto;
	public Float importe;

	public ReciboPago(int folio,String fecha,int matricula,String concepto,Float importe )
	{
		this.folio= folio;
		this.fecha= fecha;
		this.matricula= matricula;
		this.concepto= concepto;
		this.importe= importe;
	}
        public void GenerarRecibo(){
		
	}

}
