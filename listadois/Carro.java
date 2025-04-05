package listadois;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private double capacidadeTanque;
	private double consumoEstrada;
	private double consumoCidade;
	
	public Carro(String marca, String modelo, int ano, double capacidadeTanque, double consumoEstrada, double consumoCidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public double calcularAutonomiaNaCidade() {
		return capacidadeTanque * consumoCidade;
	}
	public double calcularAutonomiaNaEstrada() {
		return capacidadeTanque * consumoEstrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getConsumoEstrada() {
		return consumoEstrada;
	}

	public void setConsumoEstrada(double consumoEstrada) {
		this.consumoEstrada = consumoEstrada;
	}

	public double getConsumoCidade() {
		return consumoCidade;
	}

	public void setConsumoCidade(double consumoCidade) {
		this.consumoCidade = consumoCidade;
	}
}
