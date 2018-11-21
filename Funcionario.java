package drogaria;
import java.util.Scanner;
public class Funcionario {
    public String nomeFuncionario;
    public String endereco;
    public int CPF;
    public int telefone;
    public String cargo;
    Scanner ler = new Scanner(System.in);

    public Funcionario(String nomeFuncionario, String endereco, int CPF, int telefone, String cargo) {
        this.nomeFuncionario = nomeFuncionario;
        this.endereco = endereco;
        this.CPF = CPF;
        this.telefone = telefone;
        this.cargo = cargo;
    }
    
     public void cadastrarFuncionario(String nomeFuncionario, String cargo){
        System.out.println("Nome do funcionario: "+nomeFuncionario);
        nomeFuncionario = ler.nextLine();
        System.out.println("Cargo funcionario: "+cargo);
        cargo = ler.nextLine();
        
    }
}
