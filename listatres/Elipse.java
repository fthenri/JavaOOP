package listatres;

public class Elipse {
    private double raioMaior;
    private double raioMenor;

    public Elipse(double raioMaior, double raioMenor) {
        this.raioMaior = Math.max(raioMaior, raioMenor);
        this.raioMenor = Math.min(raioMaior, raioMenor);
    }

    public double calcularArea() {
        return Math.PI * raioMaior * raioMenor;
    }

    public double calcularPerimetro() {
        double h = Math.pow((raioMaior - raioMenor), 2) / Math.pow((raioMaior + raioMenor), 2);
        return Math.PI * (raioMaior + raioMenor) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    public double getRaioMaior() {
        return raioMaior;
    }

    public double getRaioMenor() {
        return raioMenor;
    }

    public void setRaioMaior(double raioMaior) {
        this.raioMaior = raioMaior;
    }

    public void setRaioMenor(double raioMenor) {
        this.raioMenor = raioMenor;
    }
}