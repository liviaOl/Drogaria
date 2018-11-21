package compra;
public class Produto {
    public String nome;
    public int qtd;
    public double valor;

    public Produto(String nome, int qtd, double valor) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
    }

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void cadastrarProduto(String nome, int qtd, double valor){
        
    }
}
