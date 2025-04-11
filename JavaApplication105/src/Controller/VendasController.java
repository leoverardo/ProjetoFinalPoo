package Controller;

import Model.Vendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VendasController {
    public boolean inserirVenda(Vendas venda){
    String sql = "INSERT INTO vendas (idProduto, idCliente, idFuncionario, valorVenda) "
               + " VALUES (?,?,?,?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setInt(1, venda.getIdProduto());
      comando.setInt(2, venda.getIdCliente());
      comando.setInt(3, venda.getIdFuncionario());
      comando.setDouble(4, venda.getValorVenda());
      
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
