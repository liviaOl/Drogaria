/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;

/**
 *
 * @author root
 */
public class Funcionario {
    private String nome;
    private String endereco;
    private int CPF;
    private String cargo;
    private int telefone;

    public Funcionario(String nome, String endereco, int CPF, String cargo, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.cargo = cargo;
        this.telefone = telefone;
    }
    public void cadastrarFuncionario(String nome, String endereco, int CPF, String cargo, int telefone){
        
    }
}
