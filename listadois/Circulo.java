package listadois;

import listatres.Elipse;

public class Circulo extends Elipse {

	public Circulo(double raio) {
		super(raio,raio);
	}
	
	public double obterRaio(){
		return getRaioMaior();
	}
}
