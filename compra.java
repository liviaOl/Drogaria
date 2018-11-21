package drogaria;
import java.util.Scanner;
public class compra {
    public String remedio;
    public int qtdRemedio;
    public float valorRemedio;
    public String produto;
    public int qtdProduto;
    public float valorProduto;
    Scanner ler = new Scanner(System.in);

    public compra(String remedio, int qtdRemedio, float valorRemedio, String produto, int qtdProduto, float valorProduto) {
        this.remedio = remedio;
        this.qtdRemedio = qtdRemedio;
        this.valorRemedio = valorRemedio;
        this.produto = produto;
        this.qtdProduto = qtdProduto;
        this.valorProduto = valorProduto;
    }
    
    
    public void escolherCompra(){
         System.out.println("Escolha o remedio desejado: "+remedio);
         remedio = ler.nextLine();
         
                 
    }   
   
    
    public float compraValorTotal(float valorRemedio , float valorProduto ){
        System.out.println("O valor total da compra é: "+(valorRemedio+valorProduto));
    }

    
    public compra() {
    }
}

