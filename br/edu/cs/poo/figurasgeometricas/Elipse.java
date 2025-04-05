package br.edu.cs.poo.figurasgeometricas;

public class Elipse {
    private final double raioMaior;
    private final double raioMenor;

    public static final double PI = 3.141592653589793;

    public Elipse(double raioMaior, double raioMenor) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }

    public double getRaioMaior() {
        return raioMaior;
    }

    public double getRaioMenor() {
        return raioMenor;
    }

    public double calcularArea() {
        return PI * raioMaior * raioMenor;
    }

    public double calcularPerimetroAproximado() {
        return PI * (3*(raioMaior + raioMenor) - Math.sqrt((3*raioMaior + raioMenor)*(raioMaior + 3*raioMenor)));
    }
}
