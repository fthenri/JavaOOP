package listatres;

import java.util.Scanner;

import listadois.Circulo;

public class ProgramaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double raio = scanner.nextDouble();
        
        Circulo circulo = new Circulo(raio);
        
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        
        scanner.close();
    }
}
