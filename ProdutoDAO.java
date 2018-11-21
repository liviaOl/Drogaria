
package compra.DAO;

import compra.DAO.Conexao.ConexaoComMySQL;
import compra.DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import compra.Produto;
import compra.Produto;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class ProdutoDAO {
    private Connection conexao=null;

    public ProdutoDAO() {
    conexao = Conexao.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Produto produto){ 
        String sql = "INSERT INTO Produto (nome, qtd, valor) VALUES (?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setInt(2, produto.getQtd());
        statement.setDouble(3, produto.getValor());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
    
    //SELECT
    /*public List<Produto> select(){ 
         String sql = "SELECT * FROM categoria";
         PreparedStatement statement = null;
         ResultSet resultset = null;
         List<Produto> categorias = new ArrayList<>();
         try{
             statement = conexao.prepareStatement(sql);
             resultset = statement.executeQuery();
             while(resultset.next()){
                 Produto categoria = new Produto();
                 categoria.set(resultset.getString("descricao"));
                 categorias.add(categoria);
             }
         }catch(SQLException e ){
             System.out.println("erro "+e);
         }
         finally{
             ConexaoComMySQL.FecharConexao();
         }
         return categorias;
    }*/
    
    //UPDATE
    public boolean update (Produto produto){ 
        String sql = "UPDATE Produto SET nome,qtd,valor = ?,?,? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setInt(2, produto.getQtd());
        statement.setDouble(3, produto.getValor());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
    
    //DELETE
    public boolean delete (Produto produto){
        String sql = "DELETE FROM nome, qtd, valor WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setInt(2, produto.getQtd());
        statement.setDouble(3, produto.getValor());
        statement.executeUpdate();
        return true;
    }catch (SQLException e){
            System.out.println("erro: "+e);
            return false;
    }finally{
            //fechar conexao
            ConexaoComMySQL.FecharConexao();
        }
    }
}