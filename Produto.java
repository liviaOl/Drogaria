package drogaria;
import java.util.Scanner;
public class Produto {
    public String nomeProduto;
    public int qtdProduto;
    public float valorProduto;
    Scanner ler = new Scanner(System.in);

    public Produto(String nomeProduto, int qtdProduto, float valorProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.valorProduto = valorProduto;
    }
 
    public void cadastrarProduto(String nomeProduto,int qtdProduto, float valorProduto){
        System.out.println("Digite o nome do remedio: "+nomeProduto);
        nomeProduto = ler.nextLine();
        System.out.println("Digite a quantidade do remedio no estoque: "+qtdProduto);
        qtdProduto = ler.nextInt();
        System.out.println("Digite o valor unitário do remedio: "+valorProduto);
        valorProduto = ler.nextFloat();
        
    
    } 
}
