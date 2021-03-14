/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author diogo
 */
public class Aluno extends Pessoa{

    public Aluno() {
    }

    public Aluno(String nome, String profissao) {
        super(nome, profissao);
    }
    
    public String aprender(){
        return "Aprender";
    }
}
