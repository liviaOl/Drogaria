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
public class formas_Pagamento {

    private double valorTotal;
    private String[] formaPagamento;

    public formas_Pagamento(double valorTotal, String[] formaPagamento) {
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public static void pagarDinheiro() {

    }
    public static void pagarCredito(){
        
    }
    public static void pagarDebito(){
        
    }
}
