package br.com.devmob.professoraluno;

public class Pessoa {
    private String nome;
    private String profissao;

    public Pessoa() {
    }

    public Pessoa(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
