

package compra.DAO;

import compra.DAO.Conexao.ConexaoComMySQL;
import compra.DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import compra.Remedio;
import compra.Remedio;

/**
 *
 * @author Camila <Camila.Serrao>
 */

//classe Data Acess Object. Criar uma classe DOA para cada classe bean.
//Exemplo com classe Categoria.

public class RemedioDAO {
    private Connection conexao=null;

    public RemedioDAO() {
    conexao = Conexao.getConexaoMySQL();
    }
    
    //inserir
    public boolean insert(Remedio remedio){ 
        String sql = "INSERT INTO Remedio (nome, qtd, valor) VALUES (?,?,?)";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, remedio.getNome());
        statement.setInt(2, remedio.getQtd());
        statement.setDouble(3, remedio.getValor());
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
    public boolean update (Remedio remedio){ 
        String sql = "UPDATE Remedio SET nome,qtd,valor = ?,?,? WHERE id= ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, remedio.getNome());
        statement.setInt(2, remedio.getQtd());
        statement.setDouble(3, remedio.getValor());
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
    public boolean delete (Remedio remedio){
        String sql = "DELETE FROM nome, qtd, valor WHERE id = ?";
        PreparedStatement statement = null;
        try{
        statement = conexao.prepareStatement(sql);
        statement.setString(1, remedio.getNome());
        statement.setInt(2, remedio.getQtd());
        statement.setDouble(3, remedio.getValor());
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