package listadois;

public class Retangulo {
	private double lado;
	private double altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return lado*altura;
	}
	
	public double calcularPerimetro() {
		return (lado+altura)*2;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}
