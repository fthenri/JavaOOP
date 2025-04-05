package br.edu.cs.poo.pessoa;

import java.time.LocalDate;

public final class PessoaJuridica extends Pessoa {
    private double faturamento;
    private int quantidadeSocios;
    private String cnpj;
    private static int quantidadeCriada = 0;

    public PessoaJuridica(String nome, LocalDate dataDeAbertura, double faturamento, int quantidadeSocios, String cnpj) {
        super(nome, dataDeAbertura);
        this.faturamento = faturamento;
        this.quantidadeSocios = quantidadeSocios;
        this.cnpj = cnpj;
        quantidadeCriada++;
    }

    public static int getQuantidadeCriada() {
        return quantidadeCriada;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public int getQuantidadeSocios() {
        return quantidadeSocios;
    }

    public void setQuantidadeSocios(int quantidadeSocios) {
        this.quantidadeSocios = quantidadeSocios;
    }

    protected LocalDate obterDataDeAbertura(){
		return super.getDataCriacao();
	}

    public String getCnpj() {
        return cnpj;
    }
}
