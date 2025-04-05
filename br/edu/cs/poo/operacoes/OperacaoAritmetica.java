package br.edu.cs.poo.operacoes;

public class OperacaoAritmetica {
    private static OperacaoAritmetica instancia;

    private OperacaoAritmetica(){
    }

    public static OperacaoAritmetica getInstancia(){
        if(instancia == null){
            instancia = new OperacaoAritmetica();
        }
        return instancia;
    }

    public double somar(double o1, double o2) {
        return o1 + o2;
    }

    public double subtrair(double o1, double o2) {
        return o1 - o2;
    }

    public double multiplicar(double o1, double o2) {
        return o1 * o2;
    }

    public double dividir(double o1, double o2) {
        return o1 / o2;
    }


}
