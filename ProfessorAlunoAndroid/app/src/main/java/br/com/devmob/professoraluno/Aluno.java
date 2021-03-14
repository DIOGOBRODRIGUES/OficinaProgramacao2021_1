package br.com.devmob.professoraluno;

public class Aluno extends Pessoa {
    public Aluno() {
    }

    public Aluno(String nome, String profissao) {
        super(nome, profissao);
    }
    
    public String aprender(){
        return "Aprender!";
    }
}
