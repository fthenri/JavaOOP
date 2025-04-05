package br.edu.cs.poo.figurasgeometricas;

class Circulo extends Elipse {

	Circulo(double raio) {
		super(raio,raio);
	}
	
	public double obterRaio(){
		return getRaioMaior();
	}
}
