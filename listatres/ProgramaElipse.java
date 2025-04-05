package listatres;

import java.util.Scanner;

public class ProgramaElipse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double raioMaior = scanner.nextDouble();
        double raioMenor = scanner.nextDouble();
        
        Elipse elipse = new Elipse(raioMaior, raioMenor);
        
        System.out.println(elipse.calcularArea());
        System.out.println(elipse.calcularPerimetro());
        
        scanner.close();
    }
}
