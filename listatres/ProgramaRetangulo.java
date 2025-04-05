package listatres;

import java.util.Scanner;
import listadois.Retangulo;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double lado = scanner.nextDouble();
        double altura = scanner.nextDouble();
        
        Retangulo retangulo = new Retangulo(lado, altura);
        
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
        
        scanner.close();
    }
}
