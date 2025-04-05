package listatres;

import java.util.Scanner;

public class ProgramaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double lado = scanner.nextDouble();
        
        Quadrado quadrado = new Quadrado(lado);
        
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());
        
        scanner.close();
    }
}
