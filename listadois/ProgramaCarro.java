package listadois;

import java.util.Scanner;

public class ProgramaCarro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marca1 = scanner.nextLine();
        String modelo1 = scanner.nextLine();
        int ano1 = scanner.nextInt();
        double capacidadeTanque1 = scanner.nextDouble();
        double consumoEstrada1 = scanner.nextDouble();
        double consumoCidade1 = scanner.nextDouble();
        scanner.nextLine();  
        
        Carro carro1 = new Carro(marca1, modelo1, ano1, capacidadeTanque1, consumoEstrada1, consumoCidade1);

        String marca2 = scanner.nextLine();
        String modelo2 = scanner.nextLine();
        int ano2 = scanner.nextInt();
        double capacidadeTanque2 = scanner.nextDouble();
        double consumoEstrada2 = scanner.nextDouble();
        double consumoCidade2 = scanner.nextDouble();

        Carro carro2 = new Carro(marca2, modelo2, ano2, capacidadeTanque2, consumoEstrada2, consumoCidade2);

        System.out.println(carro1.calcularAutonomiaNaCidade());
        System.out.println(carro1.calcularAutonomiaNaEstrada());


        System.out.println(carro2.calcularAutonomiaNaCidade());
        System.out.println(carro2.calcularAutonomiaNaEstrada());

        scanner.close();
    }
}
