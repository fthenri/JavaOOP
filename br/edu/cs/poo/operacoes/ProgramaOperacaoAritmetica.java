package br.edu.cs.poo.operacoes;

import java.util.Scanner;

public class ProgramaOperacaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        OperacaoAritmetica operacao = OperacaoAritmetica.getInstancia();

        double soma = operacao.somar(num1, num2);
        double subtracao = operacao.subtrair(num1, num2);
        double multiplicacao = operacao.multiplicar(num1, num2);
        double divisao = operacao.dividir(num1, num2);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        scanner.close();
    }
}
