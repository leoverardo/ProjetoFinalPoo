package Controller;

import Model.Categoria_Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CategoriaController {
    public boolean inserirCategoria(Categoria_Produto categoria){
    String sql = "INSERT INTO categoria_produto (nome) "
               + " VALUES (?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setString(1, categoria.getNome());
      
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
