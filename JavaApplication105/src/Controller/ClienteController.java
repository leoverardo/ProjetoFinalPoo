package Controller;

import Model.Clientes;
import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ClienteController {
    public boolean loginCliente(String email, String senha) {
    String sql = "SELECT * from clientes "
            + " WHERE email = ? and senha = ? ";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setString(1, email);
      comando.setString(2, senha);

      resultado = comando.executeQuery();

      if (resultado.next()) {
        return true;
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }
    return false;
  }

    
    public boolean inserirCliente(Clientes cliente){
    String sql = "INSERT INTO clientes (nome, email, senha, cpf) "
               + " VALUES (?,?,?,?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setString(1, cliente.getNome());
      comando.setString(2, cliente.getEmail());
      comando.setString(3, cliente.getSenha());
      comando.setString(4, cliente.getCpf());
      
      comando.executeUpdate();
      
      return true;      
    }catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
      gerenciador.fecharConexao(comando); 
    }
    return false;      
  }
    
    public List<Clientes> listarCliente() {
    String sql = "SELECT * FROM clientes";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    List<Clientes> listaClientes = new ArrayList<>();
    
    try {
      comando = gerenciador.prepararComando(sql);

      resultado = comando.executeQuery();

      
      while (resultado.next()) {

        Clientes clientes = new Clientes();

        clientes.setIdCliente(resultado.getInt("idProduto"));
        clientes.setNome(resultado.getString("nome"));
        clientes.setEmail(resultado.getString("email"));
        clientes.setCpf(resultado.getString("cpf"));

        listaClientes.add(clientes);
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }

    return listaClientes;
  }
    
    public Clientes buscarPorId(int idCliente) {
    String sql = "SELECT * FROM clientes "
            + " WHERE idCliente = ? ";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    Clientes clientes = new Clientes();

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setInt(1, idCliente);

      resultado = comando.executeQuery();

      if (resultado.next()) {

        clientes.setIdCliente(resultado.getInt("idProduto"));
        clientes.setNome(resultado.getString("nome"));
        clientes.setEmail(resultado.getString("email"));
        clientes.setCpf(resultado.getString("cpf"));
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }
    return clientes;
  }
    
    
    public boolean deletarCliente(int idCliente) {
    String sql = "DELETE FROM clientes "
               + "WHERE idCliente = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);
      comando.setInt(1, idCliente);

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
