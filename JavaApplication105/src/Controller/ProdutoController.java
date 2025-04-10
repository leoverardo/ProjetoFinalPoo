package Controller;

import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProdutoController {
    public boolean inserirProduto(Produtos produto){
    String sql = "INSERT INTO produtos (nome, preco, idCategoria, validade) "
               + " VALUES (?,?,?,?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setString(1, produto.getNome());
      comando.setDouble(2, produto.getPreco());
      comando.setInt(3, produto.getIdCategoria());
      comando.setString(4, produto.getValidade());
      
      comando.executeUpdate();
      
      return true;      
    }catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
      gerenciador.fecharConexao(comando); 
    }
    return false;      
  }
    
    public List<Produtos> consultarProdutos() {
    String sql = "SELECT * FROM produtos";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    List<Produtos> listaProdutos = new ArrayList<>();
    
    try {
      comando = gerenciador.prepararComando(sql);

      resultado = comando.executeQuery();

      
      while (resultado.next()) {

        Produtos produto = new Produtos();

        produto.setIdProduto(resultado.getInt("idProduto"));
        produto.setNome(resultado.getString("nome"));
        produto.setPreco(resultado.getDouble("preco"));
        produto.setIdCategoria(resultado.getInt("idCategoria"));
        produto.setValidade(resultado.getString("validade"));

        listaProdutos.add(produto);
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }

    return listaProdutos;
  }
}
