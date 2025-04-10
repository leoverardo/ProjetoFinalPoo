package Controller;

import Model.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
