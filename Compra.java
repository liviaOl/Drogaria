package compra;
import java.util.Scanner;

public class CompraCerta {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try{
        Produto produto1 = null;
        produto1.cadastrarProduto("Shampoo", 2, 12.45);
        Remedio remedio1=null;
        remedio1.cadastrarRemedio("Naridrin", 3, 12.45);
            System.out.println("BUNDa");
        }catch(Exception e){
        Produto produto1=new Produto("Shampoo", 2, 12.45); 
            System.out.println("CU");
        }
    }
}
