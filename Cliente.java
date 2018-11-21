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
public class Cliente {
    private String nome;
    private String endereco;
    private int CPF;
    private int telefone;

    public Cliente(String nome, String endereco, int CPF, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.telefone = telefone;
    }
    
}
