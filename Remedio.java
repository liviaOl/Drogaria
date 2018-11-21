package drogaria;
import java.util.Scanner;
public class Remedio {
    public String nomeRemedio;
    public int qtdRemedio;
    public float valorRemedio;
    Scanner ler = new Scanner(System.in);
    
    public Remedio(String nomeRemedio, int qtdRemedio, float valorRemedio) {
        this.nomeRemedio = nomeRemedio;
        this.qtdRemedio = qtdRemedio;
        this.valorRemedio = valorRemedio;
    }
    
    public void cadastrarRemedio(String nomeRemedio, int qtdRemedio, float valorRemedio){
        System.out.println("Digite o nome do remedio: "+nomeRemedio);
        nomeRemedio = ler.nextLine();
        System.out.println("Digite a quantidade do remedio no estoque: "+qtdRemedio);
        qtdRemedio = ler.nextInt();
        System.out.println("Digite o valor unitário do remedio: "+valorRemedio);
        valorRemedio = ler.nextFloat();
    }
}

