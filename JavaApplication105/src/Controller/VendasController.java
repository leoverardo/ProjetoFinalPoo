package Controller;

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
    String sql = "SELECT vendas.idVenda, clientes.nome, funcionarios.nome, produtos.nome, vendas.valorVenda "
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

        venda.setIdFuncionario(resultado.getInt("idVenda"));
        venda.setIdProduto(resultado.getInt("idProduto"));
        venda.setIdCliente(resultado.getInt("idCliente"));
        venda.setIdFuncionario(resultado.getInt("idFuncionario"));
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
    String sql = "SELECT vendas.idVenda, clientes.nome, funcionarios.nome, produtos.nome, vendas.valorVenda "
            + "from vendas join clientes on vendas.idCliente = clientes.idCliente "
            + "join funcionarios on vendas.idFuncionario = funcionarios.idFuncionario "
            + "join produtos on vendas.idProduto = produtos.idProduto"
            + " where vendas.idVenda = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    Vendas venda = new Vendas();

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setInt(1, idVenda);

      resultado = comando.executeQuery();

      if (resultado.next()) {

        venda.setIdFuncionario(resultado.getInt("idVenda"));
        venda.setIdProduto(resultado.getInt("idProduto"));
        venda.setIdCliente(resultado.getInt("idCliente"));
        venda.setIdFuncionario(resultado.getInt("idFuncionario"));
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
}
