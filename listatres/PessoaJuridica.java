package listatres;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private double faturamento;
    private int quantidadeSocios;
    private String cnpj;

    public PessoaJuridica(String nome, LocalDate dataDeAbertura, double faturamento, int quantidadeSocios, String cnpj) {
        super(nome, dataDeAbertura);
        this.faturamento = faturamento;
        this.quantidadeSocios = quantidadeSocios;
        this.cnpj = cnpj;
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

    public LocalDate obterDataDeAbertura(){
		return super.getDataCriacao();
	}

    public String getCnpj() {
        return cnpj;
    }
}
