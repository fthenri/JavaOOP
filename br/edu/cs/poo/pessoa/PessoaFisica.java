package br.edu.cs.poo.pessoa;

import java.time.LocalDate;
import java.time.Period;
import listatres.Pessoa;

public class PessoaFisica extends Pessoa {
    private double altura;
    private String cpf;

    public PessoaFisica(String nome, LocalDate dataDeNascimento, double altura, String cpf) {
        super(nome, dataDeNascimento);
        this.altura = altura;
        this.cpf = cpf;
    }

    public int calcularIdade() {
        return Period.between(getDataCriacao(), LocalDate.now()).getYears();
    }

    public int calcularIdadeNaData(LocalDate data) {
        return Period.between(getDataCriacao(), data).getYears();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    protected LocalDate obterDataDeNascimento() {
        return super.getDataCriacao();
    }

    public String getCpf() {
        return cpf;
    }
}
