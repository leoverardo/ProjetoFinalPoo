package Controller;

import Model.Produtos;
import Model.Vendas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public List<Vendas> listarVendas() {
    String sql = "SELECT vendas.idVenda as idVenda, clientes.nome as NomeCliente, funcionarios.nome as NomeFuncionario, produtos.nome as NomeProduto, vendas.valorVenda "
            + "from vendas join clientes on vendas.idCliente = clientes.idCliente join "
            + "funcionarios on vendas.idFuncionario = funcionarios.idFuncionario join "
            + "produtos on vendas.idProduto = produtos.idProduto";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    List<Vendas> listaVendas = new ArrayList<>();
    
    try {
      comando = gerenciador.prepararComando(sql);

      resultado = comando.executeQuery();

      
      while (resultado.next()) {

        Vendas venda = new Vendas();

        venda.setIdVenda(resultado.getInt("idVenda"));
        venda.setNomeCliente(resultado.getString("NomeCliente"));
        venda.setNomeFuncionario(resultado.getString("NomeFuncionario"));
        venda.setNomeProduto(resultado.getString("NomeProduto"));
        venda.setValorVenda(resultado.getDouble("valorVenda"));

        listaVendas.add(venda);
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }

    return listaVendas;
  }
  
    public Vendas buscarPorIdVenda(int idVenda) {
   String sql = "SELECT vendas.idVenda as idVenda, "
        + "vendas.idCliente as idCliente, "
        + "vendas.idFuncionario as idFuncionario, "
        + "vendas.idProduto as idProduto, "
        + "clientes.nome as NomeCliente, "
        + "funcionarios.nome as NomeFuncionario, "
        + "produtos.nome as NomeProduto, "
        + "vendas.valorVenda "
        + "FROM vendas "
        + "JOIN clientes ON vendas.idCliente = clientes.idCliente "
        + "JOIN funcionarios ON vendas.idFuncionario = funcionarios.idFuncionario "
        + "JOIN produtos ON vendas.idProduto = produtos.idProduto "
        + "WHERE vendas.idVenda = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    Vendas venda = new Vendas();

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setInt(1, idVenda);

      resultado = comando.executeQuery();

      if (resultado.next()) {

        venda.setIdVenda(resultado.getInt("idVenda"));
        venda.setIdCliente(resultado.getInt("idCliente"));         
        venda.setIdFuncionario(resultado.getInt("idFuncionario")); 
        venda.setIdProduto(resultado.getInt("idProduto"));  
        venda.setNomeCliente(resultado.getString("NomeCliente"));
        venda.setNomeFuncionario(resultado.getString("NomeFuncionario"));
        venda.setNomeProduto(resultado.getString("NomeProduto"));
        venda.setValorVenda(resultado.getDouble("valorVenda"));

      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }
    return venda;
  }
    
    
    public boolean deletarVenda(int idVenda) {
    String sql = "DELETE FROM vendas "
               + "WHERE idVenda = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);
      comando.setInt(1, idVenda);

      comando.executeUpdate();

      return true;
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao excluir: "
              + ex);
    } finally {
      gerenciador.fecharConexao(comando);
    }
    return false;
  }
     public boolean alterarVenda(Vendas vend) {
    String sql = "UPDATE vendas SET idCliente=?, idProduto = ?, "
            + " idFuncionario = ?, valorVenda = ? WHERE idVenda = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setInt(1, vend.getIdCliente());
      comando.setInt(2, vend.getIdProduto());
      comando.setInt(3, vend.getIdFuncionario());
      comando.setDouble(4, vend.getValorVenda());
      comando.setInt(5, vend.getIdVenda());

      comando.executeUpdate();

      return true;
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
    } finally {
      gerenciador.fecharConexao(comando);
    }
    return false;
  }
}
