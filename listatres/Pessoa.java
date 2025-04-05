package listatres;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataCriacao;

    public Pessoa(String nome, LocalDate dataCriacao) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
