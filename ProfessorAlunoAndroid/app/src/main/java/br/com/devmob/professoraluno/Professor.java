package br.com.devmob.professoraluno;

public class Professor extends Pessoa {
    public Professor() {
    }

    public Professor(String nome, String profissao) {
        super(nome, profissao);
    }
    
    public String ensinar(){
        return "Ensinar";
    }
}
