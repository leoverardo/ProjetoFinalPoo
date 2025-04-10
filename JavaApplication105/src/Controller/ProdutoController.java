package Controller;

import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
