package compra;
import java.util.Scanner;
import java.util.List;

public class Compra {

    public static void main(String[] args) {
        List<Produto> produtos;
        List<Remedio> remedios; 
        double valortotal=0;
        Scanner ler = new Scanner(System.in);
        try{
        Produto produto1 = null;
        produto1.cadastrarProduto("Absorvente", 45, 4.99);
        Produto produto2 = null;
        produto2.cadastrarProduto("Shampoo", 45, 12.99);
        Produto produto3 = null;
        produto3.cadastrarProduto("Condicionador", 45, 14.99);
        Produto produto4 = null;
        produto4.cadastrarProduto("Perfume", 45, 25.45);
        Produto produto5 = null;
        produto5.cadastrarProduto("Cotonete", 45, 1.99);
        Remedio remedio1=null;
        remedio1.cadastrarRemedio("Nimesulida", 25, 16.99);
        Remedio remedio2=null;
        remedio2.cadastrarRemedio("Paracetamol", 25, 25.45);
        Remedio remedio3=null;
        remedio3.cadastrarRemedio("Dipirona", 25, 12.99);
        
        }catch(Exception e){
        Produto produto1=new Produto("Absorvente",45,4.99); 
        Produto produto2=new Produto("Shampoo",45,12.99); 
        Produto produto3=new Produto("Condicionador",45,14.99);
        Produto produto4=new Produto("Perfume",45,25.45);
        Produto produto5=new Produto("Cotonete",45,1.99); 
        Remedio remedio1= new Remedio("Nimesulida",16,16.99);
         Remedio remedio2= new Remedio("Paracetamol", 25, 25.45);
         Remedio remedio3= new Remedio("Dipirona", 25, 12.99);
         
         
         
        }
    }
}
