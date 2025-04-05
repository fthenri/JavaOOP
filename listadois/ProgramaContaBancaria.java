package listadois;

import java.util.Scanner;

public class ProgramaContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroConta = scanner.nextLine();
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);

        while (true) {
            boolean operacao = scanner.nextBoolean();
            double valor = scanner.nextDouble();

            if (valor < 0) {
                break;
            }

            if (operacao) {
                conta.depositar(valor);
                System.out.println(conta.getSaldo());
            } else {
                if (conta.sacar(valor)) {
                    System.out.println("Realizado");
                } else {
                    System.out.println("Não realizado");
                }
            }
        }

        System.out.println(conta.getSaldo());

        scanner.close();
    }
}
