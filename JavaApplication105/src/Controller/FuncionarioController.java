package Controller;

import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FuncionarioController {
    public boolean loginCliente(String email, String senha) {
    String sql = "SELECT * from funcionarios "
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
    
    public boolean inserirProduto(Funcionario funcionario){
    String sql = "INSERT INTO funcionarios (nome, email, senha, cpf, cargo) "
               + " VALUES (?,?,?,?,?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setString(1, funcionario.getNome());
      comando.setString(2, funcionario.getEmail());
      comando.setString(3, funcionario.getSenha());
      comando.setString(4, funcionario.getCpf());
      comando.setString(5, funcionario.getCargo());
      
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
